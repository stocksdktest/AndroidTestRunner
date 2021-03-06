package com.chi.ssetest.cases;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.chi.ssetest.TestcaseException;
import com.chi.ssetest.protos.SetupConfig;
import com.chi.ssetest.setup.RunnerSetup;
import com.chi.ssetest.StockTestcase;
import com.chi.ssetest.StockTestcaseName;
import com.chi.ssetest.setup.TestcaseConfigRule;
import com.mitake.core.AddValueModel;
import com.mitake.core.QuoteItem;
import com.mitake.core.SubNewStockRankingModel;
import com.mitake.core.bean.log.ErrorInfo;
import com.mitake.core.request.AddValueRequest;
import com.mitake.core.request.QuoteRequest;
import com.mitake.core.request.SubNewBondStockRankingRequest;
import com.mitake.core.request.SubNewStockRankingRequest;
import com.mitake.core.response.AddValueResponse;
import com.mitake.core.response.IResponseInfoCallback;
import com.mitake.core.response.QuoteResponse;
import com.mitake.core.response.Response;
import com.mitake.core.response.SubNewStockRankingResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *次新债
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@StockTestcase(StockTestcaseName.SUBNEWBONDSTOCKRANKINGTEST_1)
public class SubNewBondStockRankingTest_1 {
    private static final StockTestcaseName testcaseName = StockTestcaseName.SUBNEWBONDSTOCKRANKINGTEST_1;
    private static SetupConfig.TestcaseConfig testcaseConfig;
    private static final int timeout_ms = 1000000;
    @BeforeClass
    public static void setup() throws Exception {
        Log.d(" SubNewBondStockRankingTest_1", "Setup");
        testcaseConfig = RunnerSetup.getInstance().getTestcaseConfig(testcaseName);
        if (testcaseConfig == null ) {
            throw new Exception(String.format("Testcase(%s) setup failed, config is empty", testcaseName));
        }
    }
    @Rule
    public TestcaseConfigRule rule = new TestcaseConfigRule(testcaseConfig);

    @Test(timeout = timeout_ms)
    public void requestWork() throws Exception {
        Log.d("SubNewBondStockRankingTest_1", "requestWork");
        // TODO get custom args from param
        final String quoteNumbers = rule.getParam().optString("PARAMS");
        final CompletableFuture result = new CompletableFuture<JSONObject>();
//        for (int i=0;i<quoteNumbers.length;i++){
            SubNewBondStockRankingRequest request = new SubNewBondStockRankingRequest();
            request.send(quoteNumbers, new IResponseInfoCallback<SubNewStockRankingResponse>() {
                @Override
                public void callback(SubNewStockRankingResponse subNewStockRankingResponse) {
                    try {
                        assertNotNull(subNewStockRankingResponse.list);
                    } catch (AssertionError e) {
                        //                        result.completeExceptionally(e);
                        result.complete(new JSONObject());
                    }
                    ArrayList<SubNewStockRankingModel> list=subNewStockRankingResponse.list;
                    try {
                        JSONObject uploadObj = new JSONObject();
                        if(list!=null){
                            for (int i=0;i<list.size();i++) {
                                JSONObject uploadObj_1 = new JSONObject();
                                uploadObj_1.put("name",list.get(i).getName());
                                uploadObj_1.put("code",list.get(i).getCode());
                                uploadObj_1.put("subType",list.get(i).getSubType());
                                uploadObj_1.put("originalPrice",list.get(i).getOriginalPrice());
                                uploadObj_1.put("lastestPrice",list.get(i).getLastestPrice());
                                uploadObj_1.put("originalData",list.get(i).getOriginalData());
//                            uploadObj_1.put("continuousLimitedDays",list.get(i).getContinuousLimitedDays());//无值
                                uploadObj_1.put("rate",list.get(i).getRate());
                                uploadObj_1.put("allRate",list.get(i).getAllRate());
                                uploadObj_1.put("preClosePrice",list.get(i).getPreClosePrice());
                                uploadObj_1.put("change",list.get(i).getChange());
                                uploadObj_1.put("turnoverRate",list.get(i).getTurnoverRate());
                                uploadObj_1.put("amount",list.get(i).getAmount());
                                uploadObj_1.put("mainforceMoneyNetInflow",list.get(i).getMainforceMoneyNetInflow());
                                uploadObj_1.put("pe",list.get(i).getPe());
                                uploadObj_1.put("totalValue",list.get(i).getTotalValue());
                                uploadObj_1.put("flowValue",list.get(i).getFlowValue());
                                uploadObj_1.put("bu",list.get(i).getBu());
                                uploadObj_1.put("su",list.get(i).getSu());
//                            Log.d("data", String.valueOf(uploadObj_1));
                                uploadObj.put(String.valueOf(i+1),uploadObj_1);
                            }
                        }
//                        Log.d("data", String.valueOf(uploadObj));
                        result.complete(uploadObj);
                    } catch (JSONException e) {
                        result.completeExceptionally(e);
                    }
                }
                @Override
                public void exception(ErrorInfo errorInfo) {
                    result.completeExceptionally(new Exception(errorInfo.toString()));
                }
            });
            try {
                JSONObject resultObj = (JSONObject)result.get(timeout_ms, TimeUnit.MILLISECONDS);
                RunnerSetup.getInstance().getCollector().onTestResult(testcaseName, rule.getParam(), resultObj);
            } catch (Exception e) {
                //                throw new Exception(e);
                throw new TestcaseException(e,rule.getParam());
            }
//        }
    }
}