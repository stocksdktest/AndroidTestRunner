package com.chi.ssetest;

public enum StockTestcaseName {
    QUOTE_REQUEST_EXAMPLE("TESTCASE_0"),//测试例子
    ADDVALUETEST_1("ADDVALUE_1"),//增值指标
    ADDVALUETEST_2("ADDVALUE_2"),//增值指标
    ADDVALUETEST_3("ADDVALUE_3"),//增值指标
    AFTERHOURSCHARTTEST_1("AFTERHOURSCHART_1"),//盘后走势接口（科创板）
    AFTERHOURSCHARTTEST_2("AFTERHOURSCHART_2"),//盘后走势接口（科创板）
    AHLISTTEST_1("AHLIST_1"),//AH股列表
    AHLISTTEST_2("AHLIST_2"),//AH股列表
    AHQUOTETEST_1("AHQUOTE_1"),//AH联动
    BANKUAIQUOTETEST_1("BANKUAIQUOTE_1"),//个股所属板块行情
    BANKUAISORTINGTEST_1("BANKUAISORTING_1"),//板块排序接口
    BANKUAISORTINGTEST_2("BANKUAISORTING_2"),//板块排序接口
    BIDCHARTTEST_1("BIDCHART_1"),//集合竞价走势接口
    BIDCHARTTEST_2("BIDCHART_2"),//集合竞价走势接口
    BROKERINFOTEST_1("BROKERINFO_1"),//经纪席位
    CATEQUOTETEST_1("CATEQUOTE_1"),//版块类股票行情
    CATESORTINGTEST_1("CATESORTING_1"),//排序接口
    CATESORTINGTEST_2("CATESORTING_2"),//排序接口
    CATESORTINGTEST_3("CATESORTING_3"),//排序接口
    CATESORTINGTEST_4("CATESORTING_4"),//排序接口（已废弃）
    CHARTSUBTEST_1("CHARTSUB_1"),//走势副图指标接口
    CHARTSUBTEST_2("CHARTSUB_2"),//走势副图指标接口
    CHARTV2TEST_1("CHARTV2TEST_1"),//走势数据
    CHARTV2TEST_2("CHARTV2TEST_2"),//走势数据
    CHARTV2TEST_3("CHARTV2TEST_3"),//走势数据
    CHARTV2TEST_4("CHARTV2TEST_4"),//走势数据
    CHARTV2TEST_5("CHARTV2TEST_5"),//走势数据
    CHARTV2TEST_6("CHARTV2TEST_6"),//走势数据
    COMPOUNDUPDOWNTEST_1("COMPOUNDUPDOWN_1"),//涨跌分布请求接口
    CONVERTIBLETEST_1("CONVERTIBLE_1"),//可转债溢价查询
    DRLINKQUOTETEST_1("DRLINKQUOTE_1"),//CDR,GDR联动
    DRQUOTELISTTEST_1("DRQUOTELIST_1"),//CDR,GDR列表
    HISTORYCHARTTEST_1("HISTORYCHART_1"),//历史分时
    HISTORYCHARTTEST_2("HISTORYCHART_2"),//历史分时
    HKMARINFOTEST_1("HKMARINFO_1"),//两市港股通额度资讯
    HKPRICEINFOTEST_1("HKPRICEINFO_1"),//获取港股价差对照表
    HKSTOCKINFOTEST_1("HKSTOCKINFO_1"),//港股其他
    HOLIDAYTEST_1("HOLIDAY_1"),//节假日
    HSAMOUNTTEST_1("HSAMOUNT_1"),//沪股通和深股通额度
    L2TICKDETAILV2TEST_1("L2TICKDETAILV2_1"),//L2单独逐笔接口
    L2TICKV2TEST_1("L2TICKV2_1"),//L2单独分笔接口
    MARKETUPDOWNTEST_1("MARKETUPDOWN_1"),//沪深当日涨跌统计数据
    MOREPRICETEST_1("MOREPRICE_1"),//分价
    MOREPRICETEST_2("MOREPRICE_2"),//分价
    MOREVOLUMETEST_1("MOREVOLUMETEST_1"),//分量
    OFFERQUOTETEST_1("OFFERQUOTE_1"),//要约收购接口请求
    OFFERQUOTETEST_2("OFFERQUOTE_2"),//要约收购接口请求
    OHLCSUBTEST_1("OHLCSUB_1"),//复权信息接口  K线复权接口
    OHLCTEST_1("OHLCTEST_1"),//K线数据(已废弃)
    OHLCTEST_2("OHLCTEST_2"),//K线数据(已废弃)
    OHLCV3TEST_1("OHLCV3_1"),//历史K线
    OHLCV3TEST_2("OHLCV3_2"),//历史K线
    OHLCV3TEST_3("OHLCV3_3"),//历史K线
    OHLCV3TEST_4("OHLCV3_4"),//历史K线
    OHLCV3TEST_5("OHLCV3_5"),//历史K线
    OHLCV3TEST_6("OHLCV3_6"),//历史K线
    OPTIONEXPIRETEST_1("OPTIONEXPIRE_1"),//期权-交割月
    OPTIONLISTTEST_1("OPTIONLIST_1"),//期权-标的行情
    OPTIONQUOTETEST_1("OPTIONQUOTE_1"),//期权-商品行情
    OPTIONTQUOTETEST_1("OPTIONTQUOTE_1"),//期权-T型报价
    ORDERQUANTITYTEST_1("ORDERQUANTITY_1"),//买卖队列
    ORDERQUANTITYTEST_2("ORDERQUANTITY_2"),//买卖队列
    OVERLAYCHARTTEST_1("OVERLAYCHART_1"),//走势叠加
    OVERLAYCHARTTEST_2("OVERLAYCHART_2"),//走势叠加
    PLATEINDEXQUOTETEST_1("PLATEINDEXQUOTE_1"),//板块指数（已废弃）
    PLATEINDEXQUOTETEST_2("PLATEINDEXQUOTE_2"),//板块指数（已废弃）
    QUOTEDETAILTEST_1("QUOTEDETAIL_1"),//行情快照
    QUOTEDETAILTEST_2("QUOTEDETAIL_2"),//行情快照
    QUOTEDETAILTEST_3("QUOTEDETAIL_3"),//行情快照（已废弃）
    QUOTETEST_1("QUOTE_1"),//证券行情列表
    QUOTETEST_2("QUOTE_2"),//证券行情列表
    SEARCHTEST_1("SEARTEST_1"),//股票查询
    SEARCHTEST_2("SEARTEST_2"),//股票查询
    SEARCHTEST_3("SEARTEST_3"),//股票查询
    SEARCHTEST_4("SEARTEST_4"),//股票查询
    SEARCHTEST_5("SEARTEST_5"),//股票查询
    SEARCHV2TEST_1("SEARV2TEST_1"),//新版股名在线搜索接口
    SEARCHV2TEST_2("SEARV2TEST_2"),//新版股名在线搜索接口
    SUBNEWBONDSTOCKRANKINGTEST_1("SUBNEWBONDSTOCKRANKING_1"),//次新债
    SUBNEWSTOCKRANKINGTEST_1("SUBNEWSTOCKRANKING_1"),//次新股
    TICKTEST_1("TICK_1"),//明细详情接口  分时明细
    TRADEDATETEST_1("TRADEDATE_1"),//市场当年交易日接口   取到市场当年交易日
    TRADEDATETEST_2("TRADEDATE_2"),//市场当年交易日接口   取到市场当年交易日
    TRADEQUOTETEST_1("TRADEQUOTE_1"),//交易行情
    UKQUOTETEST_1("UKQUOTE_1"),//uk市场快照单独接口
    UPDOWNSTEST_1("UPDOWNS_1"),//沪深A股及指数涨跌平家数
//    F10
    F10_ASSETALLOCATIONTEST_1("F10_ASSETALLOCATION_1"),//资产配置
    F10_BLOCKTRADETEST_1("F10_BLOCKTRADE_1"),//大宗交易
    F10_BNDBUYBACKSTEST_1("F10_BNDBUYBACKS_1"),//债券回购
    F10_BNDINTERESTPAYTEST_1("F10_BNDINTERESTPAY_1"),//付息情况
    F10_BNDNEWSHARESCALTEST_1("F10_BNDNEWSHARESCAL_1"),//当日新债
    F10_BNDSHAREIPODETAITEST_1("F10_BNDSHAREIPODETAI_1"),//新债详情
    F10_BONDBASICTEST_1("F10_BONDBASIC_1"),//债券概况
    F10_BONDTRADINGDAYTEST_1("F10_BONDTRADINGDAY_1"),//新债日历
    F10_BONUSFINANCETEST_1("F10_BONUSFINANCE_1"),//分红配送
    F10_CALENDARTEST_1("F10_CALENDAR_1"),//新股日历
    F10_COMPANYINFOTEST_1("F10_COMPANYINFO_1"),//基本情况
    F10_COREBUSINESSTEST_1("F10_COREBUSINESS_1"),//主要业务
    F10_FINANCEMRGNINTEST_1("F10_FINANCEMRGNIN_1"),//沪深---融资融券--分市场提供最近交易日
    F10_FINANCEMRGNINTEST_2("F10_FINANCEMRGNIN_2"),//沪深---融资融券--分市场提供最近交易日
    F10_FINANCEMRGNINTEST_3("F10_FINANCEMRGNIN_3"),//沪深---融资融券--分市场提供最近交易日
    F10_FININFOIMAGETEST_1("F10_FININFOIMAGE_1"),//财经资讯图片
    F10_FNDDIVIDEENDTEST_1("F10_FNDDIVIDEEND_1"),//基金分红
    F10_FNDFINANCETEST_1("F10_FNDFINANCE_1"),//基金财务
    F10_FNDNAVINDEXTEST_1("F10_FNDNAVINDEX_1"),//基金净值(12月)
    F10_FORECASTRATINGTEST_1("F10_FORECASTRATING_1"),//机构评等
    F10_FORECASTYEARTEST_1("F10_FORECASTYEAR_1"),//机构预测
    F10_FUNDBASICTEST_1("F10_FUNDBASIC_1") ,//基金概况
    F10_FUNDSHAREHOLDERINFOTEST_1("F10_FUNDSHAREHOLDERINFO_1"),//最新基金持股
    F10_FUNDVALUETEST_1("F10_FUNDVALUE_1"),//基金净值（五日）
    F10_IMPORTANTNOTICETEST_1("F10_IMPORTANTNOTICE_1"),//大事提醒
    F10_INDUSTRYPORTFOLIOTEST_1("F10_INDUSTRYPORTFOLIO_1"),//行业组合
    F10_LEADERPERSONINFOTEST_1("F10_LEADERPERSONINFO_1"),//管理层
    F10_MAINFINADATANASSTEST_1("F10_MAINFINADATANASS_1"),//财务报表
    F10_MAINFINADATANASSTEST_2("F10_MAINFINADATANASS_2"),//财务报表
    F10_MAINFINAINDEXNASTEST_1("F10_MAINFINAINDEXNAS_1"),//财务指标
    F10_MAINFINAINDEXNASTEST_2("F10_MAINFINAINDEXNAS_2"),//财务指标
    F10_NEWINDEXTEST_1("F10_NEWINDEX_1"),//最新指标
    F10_NEWSHAREDETAILTEST_1("F10_NEWSHAREDETAIL_1"),//新股详情
    F10_NEWSHARELISTTEST_1("F10_NEWSHARELIST_1"),//当日新股列表
    F10_NEWSLISTTEST_1("F10_NEWSLIST_1"),//财经资讯列表
    F10_NEWSTEST_1("F10_NEWS_1"),//财经资讯明細
    F10_SHAREHOLDERHISTORYINFOTEST_1("F10_SHAREHOLDERHISTORYINFO_1"),//股东变动
    F10_SHARESTRUCTURETEST_1("F10_SHARESTRUCTURE_1"),//份额结构
    F10_STOCKBULLETINLISTTEST_1("F10_STOCKBULLETINLIST_1"),//个股/自选公告
    F10_STOCKBULLETINLISTTEST_2("F10_STOCKBULLETINLIST_2"),//个股/自选公告
    F10_STOCKBULLETINTEST_1("F10_STOCKBULLETIN_1"),//个股公告内文
    F10_STOCKNEWSLISTTEST_1("F10_STOCKNEWSLIST_1"),//个股/自选新闻
    F10_STOCKNEWSLISTTEST_2("F10_STOCKNEWSLIST_2"),//个股/自选新闻
    F10_STOCKNEWSTEST_1("F10_STOCKNEWS_1"),//个股新闻内文
    F10_STOCKPORTFOLIOTEST_1("F10_STOCKPORTFOLIO_1"),//股票组合
    F10_STOCKREPORTLISTTEST_1("F10_STOCKREPORTLIST_1"),//个股/自选研报
    F10_STOCKREPORTLISTTEST_2("F10_STOCKREPORTLIST_2"),//个股/自选研报
    F10_STOCKREPORTTEST_1("F10_STOCKREPORT_1"),//个股研报内文
    F10_STOCKSHARECHANGEINFOTEST_1("F10_STOCKSHARECHANGEINFO_1"),//股本变动
    F10_STOCKSHAREINFOTEST_1("F10_STOCKSHAREINFO_1"),//股本结构
    F10_STRUCTUREDFUNDTEST_1("F10_STRUCTUREDFUND_1"),//分级基金
    F10_TOPLIQUIDSHAREHOLDERTEST_1("F10_TOPLIQUIDSHAREHOLDER_1"),//最新十大流通股股东
    F10_TOPSHAREHOLDERTEST_1("F10_TOPSHAREHOLDER_1"),//最新十大股东
    F10_TRADEDETAILTEST_1("F10_TRADEDETAIL_1"),//融资融券
    F10V2TEST_1("F10V2TEST_1"),//財汇沪深盘后接口
    F10V2TEST_2("F10V2TEST_2"),//財汇沪深盘后接口
    F10V2TEST_3("F10V2TEST_3"),//財汇沪深盘后接口
    F10V2TEST_4("F10V2TEST_4"),//財汇沪深盘后接口
    //TCP
    TCP_CHARTV2TEST_1("TCP_CHARTV2TEST_1"),//走势数据TCP
    TCP_CHARTV2TEST_2("TCP_CHARTV2TEST_2"),//走势数据TCP
    QUOTEDETAILTCPTEST_1("QUOTEDETAILTCPTEST_1"),//行情快照TCP
    QUOTEDETAILTCPTEST_2("QUOTEDETAILTCPTEST_2"),//行情快照TCP
    TCP_TICKTEST_1("TCP_TICKTEST_1"),//分笔TCP
    TCP_TRADETEST_1("TCP_TRADETEST_1");//交易行情


    private String stringVal;
    StockTestcaseName(String numVal) {
        this.stringVal = numVal;
    }

    public String val() {
        return stringVal;
    }

    public static StockTestcaseName fromString(String text) {
        for (StockTestcaseName b : StockTestcaseName.values()) {
            if (b.stringVal.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
