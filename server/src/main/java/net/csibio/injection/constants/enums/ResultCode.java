package net.csibio.injection.constants.enums;

import java.io.Serializable;

public enum ResultCode implements Serializable {

    /**
     * ******
     * 系统错误
     * *******
     */
    ERROR("SYSTEM_ERROR", "系统繁忙,请稍后再试!"),
    EXCEPTION("SYSTEM_EXCEPTION", "系统繁忙,稍后再试!"),
    IO_EXCEPTION("IO_EXCEPTION", "文件读写错误"),
    PARAMS_NOT_ENOUGH("PARAMS_NOT_ENOUGH", "入参不齐"),
    PARAMS_VALIDATE_ERROR("PARAMS_VALIDATE_ERROR", "入参校验失败"),
    CACHE_MISSING("CACHE_MISSING", "缓存未命中"),

    /**
     * ******
     * 常见通用错误
     * *******
     */
    OBJECT_CANNOT_BE_NULL("OBJECT_CANNOT_BE_NULL", "对象不能为空"),
    OBJECT_IS_EXISTED("OBJECT_IS_EXISTED", "对象已存在"),
    OBJECT_NOT_EXISTED("OBJECT_NOT_EXISTED", "对象不存在"),
    QUERY_ERROR("QUERY_ERROR", "获取数据失败"),
    INSERT_ERROR("INSERT_ERROR", "插入数据失败"),
    DUPLICATE_KEY_ERROR("DUPLICATE_KEY_ERROR", "插入数据失败,已有同名项存在"),
    SAVE_ERROR("SAVE_ERROR", "保存数据失败"),
    UPDATE_ERROR("UPDATE_ERROR", "更新数据失败"),
    DELETE_ERROR("DELETE_ERROR", "删除数据失败"),
    PARSE_ERROR("PARSE_ERROR", "解析错误"),
    ID_CANNOT_BE_NULL_OR_ZERO("ID_CANNOT_BE_NULL_OR_ZERO", "ID不能为空或者0"),
    LINE_IS_EMPTY("LINE_IS_EMPTY", "内容为空"),
    EXTRACT_FAILED("EXTRACT_FAILED", "解压缩失败"),
    UNAUTHORIZED_ACCESS("UNAUTHORIZED_ACCESS", "未经授权的非法访问"),

    /**
     * ******
     * 数据库
     * *******
     */
    DELETE_COMPOUND_ERROR("DELETE_COMPOUND_ERROR", "删除化合物失败"),
    DELETE_LIBRARY_ERROR("DELETE_LIBRARY_ERROR", "删除库失败"),
    DELETE_ANALYSE_DATA_ERROR("DELETE_ANALYSE_DATA_ERROR", "删除分析数据失败"),
    DELETE_ANALYSE_OVERVIEW_ERROR("DELETE_ANALYSE_OVERVIEW_ERROR", "删除分析总览失败"),
    DELETE_BLOCK_INDEX_ERROR("DELETE_BLOCK_INDEX_ERROR", "删除实验索引失败"),
    DELETE_RUN_ERROR("DELETE_RUN_ERROR", "删除实验失败"),
    DELETE_SET_ERROR("DELETE_SET_ERROR", "删除Set失败"),
    DELETE_PROJECT_ERROR("DELETE_PROJECT_ERROR", "删除项目失败"),
    DELETE_METHOD_ERROR("DELETE_METHOD_ERROR", "删除方案失败"),
    DELETE_TRACE_ERROR("DELETE_TRACE_ERROR", "删除任务失败"),
    DELETE_SPECTRA_ERROR("DELETE_SPECTRA_ERROR", "删除光谱失败"),

    /**
     * ******
     * library
     * *******
     */
    LIBRARY_TYPE_NOT_EXIST("LIBRARY_TYPE_NOT_EXIST", "库类型不存在"),
    LIBRARY_NAME_CANNOT_BE_EMPTY("LIBRARY_NAME_CANNOT_BE_EMPTY", "标准库名称不能为空"),
    LIBRARY_CANNOT_BE_EMPTY("LIBRARY_CANNOT_BE_EMPTY", "标准库不能为空"),
    DATA_IS_EMPTY("DATA_IS_EMPTY", "数据为空"),
    INPUT_FILE_TYPE_MUST_BE_TSV_OR_TRAML("INPUT_FILE_TYPE_MUST_BE_TSV_OR_TRAML", "上传的文件格式必须为TSV或者是TraML"),
    LIBRARY_NOT_EXISTED("LIBRARY_NOT_EXISTED", "指定的库不存在"),
    PARENT_LIBRARY_NOT_SELECTED("PARENT_LIBRARY_NOT_SELECTED", "父库未指定"),
    PARENT_LIBRARY_NOT_EXISTED("PARENT_LIBRARY_NOT_EXISTED", "父库不存在"),
    IRT_LIBRARY_NOT_EXISTED("IRT_LIBRARY_NOT_EXISTED", "指定的iRT库不存在"),
    SEARCH_FRAGMENT_LENGTH_MUST_BIGGER_THAN_3("SEARCH_FRAGMENT_LENGTH_MUST_BIGGER_THAN_3", "搜索的片段长度至少为4"),
    PEPTIDE_REF_CANNOT_BE_EMPTY("PEPTIDE_REF_CANNOT_BE_EMPTY", "PeptideRef不能为空"),
    NO_DECOY("NO_DECOY", "不使用文件中的Decoy"),
    PARENT_LIBRARY_TYPE_MUST_EQUALS_TO_SOURCE_LIBRARY_TYPE("PARENT_LIBRARY_TYPE_MUST_EQUALS_TO_SOURCE_LIBRARY_TYPE", "父库与源库的库类型必须相同"),
    CANNOT_EXPORT_TO_ITSELF("CANNOT_EXPORT_TO_ITSELF", "不能将库导入给自身"),
    LIBRARY_TYPE_NOT_SUPPORT("LIBRARY_TYPE_NOT_SUPPORT", "不支持的库类型查询"),
    DUPLICATED_COMPOUND_EXIST("DUPLICATED_COMPOUND_EXIST", "有重复存在的化合物"),
    ANA_LIBRARY_MUST_BE_THE_SAME_ONE("ANA_LIBRARY_MUST_BE_THE_SAME_ONE", "分析化合物库必须是同一个"),
    INS_LIBRARY_MUST_BE_THE_SAME_ONE("INS_LIBRARY_MUST_BE_THE_SAME_ONE", "内标化合物库必须是同一个"),
    COMPOUND_LIST_NOT_EXISTED("COMPOUND_LIST_NOT_EXISTED","化合物列表不存在"),
    GENERATE_EMPTY_LIBRARY("GENERATE_EMPTY_LIBRARY", "生成化合物库为空"),
    TARGET_LIBRARY_NOT_EXIST("TARGET_LIBRARY_NOT_EXIST", "目标库不存在"),
    LIBRARY_WITH_SAME_NAME_ALREADY_EXIST("LIBRARY_WITH_SAME_NAME_ALREADY_EXIST", "已存在同名库"),
    LIB_NOT_EXIST_OR_NOT_MATCH("LIB_NOT_EXIST_OR_NOT_MATCH", "库不存在或者不符合要求"),

    /**
     * ******
     * run
     * *******
     */
    FILE_LOCATION_CANNOT_BE_EMPTY("FILE_LOCATION_CANNOT_BE_EMPTY", "文件路径不能为空"),
    FILE_NOT_EXISTED("FILE_NOT_EXISTED", "文件不存在"),
    FILE_ALREADY_EXISTED("FILE_ALREADY_EXISTED", "文件已存在"),
    FILE_NOT_SET("FILE_NOT_SET", "文件未设定"),
    FILE_FORMAT_NOT_SUPPORTED("FILE_FORMAT_NOT_SUPPORTED","文件格式不支持"),
    RUN_NOT_EXISTED("RUN_NOT_EXISTED", "RUN数据不存在"),
    RUN_INSERT_ERROR("RUN_INSERT_ERROR", "实验数据插入失败"),
    RUN_MZXML_FILE_MUST_BE_CONVERTED_TO_AIRD_FORMAT_FILE_FIRST("RUN_MZXML_FILE_MUST_BE_CONVERTED_TO_AIRD_FORMAT_FILE_FIRST", "原始实验文件必须转换为Aird格式文件才可以进入下一步"),
    SWATH_INFORMATION_NOT_EXISTED("SWATH_INFORMATION_NOT_EXISTED", "Swath的分块信息不存在,请确保Aird压缩过程正确"),
    IRT_FIRST("IRT_FIRST", "请先对原始实验运行Irt计算"),
    IRT_EXCEPTION("IRT_EXCEPTION", "iRT失败"),
    PRM_FILE_IS_EMPTY("PRM_FILE_IS_EMPTY", "PRM文件为空"),
    PRM_FILE_FORMAT_NOT_SUPPORTED("PRM_FILE_FORMAT_NOT_SUPPORTED","PRM文件格式不支持"),
    FASTA_FILE_FORMAT_NOT_SUPPORTED("FASTA_FILE_FORMAT_NOT_SUPPORTED","FASTA文件格式不支持"),
    NO_AIRD_COMPRESSION_FOR_DIA_SWATH("NO_AIRD_COMPRESSION_FOR_DIA_SWATH","DIA-SWATH Run不需要进行Aird文件压缩,请使用Propro客户端进行压缩"),
    RUN_TYPE_MUST_DEFINE("RUN_TYPE_MUST_DEFINE","实验类型必须被定义"),
    NO_NEW_RUNS("NO_NEW_RUNS","没有扫描到新实验"),
    REORDER_ID_LENGTH_MUST_EQUAL_WITH_TARGET_RUNS_LENGTH("REORDER_ID_LENGTH_MUST_EQUAL_WITH_TARGET_RUNS_LENGTH", "重排序给到的id列表长度必须和对应的批次下的Run数目相同"),
    REORDER_ID_IS_NOT_MATCH_THE_TARGET_RUNS("REORDER_ID_IS_NOT_MATCH_THE_TARGET_RUNS", "重排序使用的id并没有匹配到对应批次下的Run表中"),
    RUN_TYPE_CANNOT_BE_NULL("RUN_TYPE_CANNOT_BE_NULL","Run类型不能为空"),
    /**
     * ******
     * SwathIndex
     * *******
     */
    SWATH_INDEX_LIST_MUST_BE_QUERY_WITH_RUN_ID("SWATH_INDEX_LIST_MUST_BE_QUERY_WITH_RUN_ID", "SwathIndex的列表页面必须至少按照RunId维度进行查询"),
    SWATH_INDEX_NOT_EXISTED("SWATH_INDEX_NOT_EXISTED", "对应的索引数据不存在"),
    SPECTRUM_NOT_EXISTED("SPECTRUM_NOT_EXISTED", "对应的原始谱图不存在"),

    /**
     * ******
     * Convolution Data
     * *******
     */
    ANALYSE_DATA_NOT_EXISTED("ANALYSE_DATA_NOT_EXISTED", "分析数据不存在"),
    ANALYSE_DATA_ID_CANNOT_BE_EMPTY("ANALYSE_DATA_ID_CANNOT_BE_EMPTY", "分析数据ID不能为空"),
    ANALYSE_DATA_ARE_ALL_ZERO("ANALYSE_DATA_ARE_ALL_ZERO", "分析数据全部为零"),
    OVERVIEW_NOT_EXISTED("OVERVIEW_NOT_EXISTED", "分析数据概览不存在"),
    OVERVIEW_ID_CAN_NOT_BE_EMPTY("OVERVIEW_ID_CAN_NOT_BE_EMPTY", "分析数据概览ID不能为空"),
    ONLY_SUPPORT_VERIFY_LIBRARY_SEARCH("ONLY_SUPPORT_VERIFY_LIBRARY_SEARCH", "本接口只支持校准库的数据聚合查询"),
    DATA_ID_CANNOT_BE_EMPTY("DATA_ID_CANNOT_BE_EMPTY", "DataId不能为空"),
    FRAGMENT_CANNOT_BE_EMPTY_ALL("FRAGMENT_CANNOT_BE_EMPTY_ALL", "肽段碎片不能全部为空"),
    FRAGMENT_LENGTH_IS_TOO_LONG("FRAGMENT_LENGTH_IS_TOO_LONG", "设定的肽段碎片长度大于本身长度"),
    POSITION_DELTA_LIST_LENGTH_NOT_EQUAL_TO_MZMAP_PLUS_ONE("POSITION_DELTA_LIST_LENGTH_NOT_EQUAL_TO_MZMAP_PLUS_ONE", "索引地址搜索块的数目与mzMap+1的结果不一致"),
    ANALYSE_DATA_IN_THE_LIST_MUST_UNDER_THE_SAME_OVERVIEW("ANALYSE_DATA_IN_THE_LIST_MUST_UNDER_THE_SAME_OVERVIEW", "数组中的分析结果必须在同一个分析概览下"),
    THE_OVERVIEW_ID_OF_THE_ANALYSE_DATA_CANNOT_BE_NULL("THE_OVERVIEW_ID_OF_THE_ANALYSE_DATA_CANNOT_BE_NULL", "分析结果对应的概览ID不能为空"),

    /**
     * ******
     * Scores
     * *******
     */
    ALL_SCORE_DATA_ARE_DECOY("ALL_SCORE_DATA_ARE_DECOY", "所有的数据都是伪肽段数据,无法打分"),
    ALL_SCORE_DATA_ARE_REAL("ALL_SCORE_DATA_ARE_REAL", "所有的数据都是真实肽段数据,未包含伪肽段,无法打分"),
    SCORES_NOT_EXISTED("SCORES_NOT_EXISTED", "打分数据不存在"),
    SCORE_DISTRIBUTION_NOT_GENERATED_YET("SCORE_DISTRIBUTION_NOT_GENERATED_YET", "子分数分布情况还未生成"),

    /**
     * ******
     * RT Normalizer
     * *******
     */
    NOT_ENOUGH_IDENTIFIED_IS("NOT_ENOUGH_IDENTIFIED_IS", "There are less than 2 internal standard compounds, not enough for an RT correction"),
    NO_RI_CALIBRATION_RESULT_FOUND("NO_RI_CALIBRATION_RESULT_FOUND", "没有找到RiCalibration结果"),

    /**
     * ******
     * Compound
     * *******
     */
    COMPOUND_NOT_EXISTED("COMPOUND_NOT_EXISTED","该化合物不存在"),
    KEY_FIELDS_CANNOT_BE_EMPTY("KEY_FIELDS_CANNOT_BE_EMPTY(UniqueId,Platform,Matrix,Species)","关键字段不能为空(UniqueId,平台,物种,基质)"),
    ROOT_COMPOUND_IS_ALREADY_EXISTED("ROOT_COMPOUND_IS_ALREADY_EXISTED","主库中已经存在关联化合物"),
    MZ_NOT_SAME("MZ_NOT_SAME", "合并的mz不相同"),
    NAME_NOT_SAME("NAME_NOT_SAME", "合并的name不相同"),
    RI_NOT_SAME("RI_NOT_SAME", "合并的ri不相同"),
    /**
     * Spectra
     */
    COMPOUND_ID_CANNOT_BE_EMPTY("COMPOUND_ID_CANNOT_BE_EMPTY", "化合物id不能为空"),
    SPECTRA_TYPE_CANNOT_BE_EMPTY("SPECTRA_TYPE_CANNOT_BE_EMPTY", "光谱图类型不能为空"),
    SPECTRA_NAME_CANNOT_BE_EMPTY("SPECTRA_NAME_CANNOT_BE_EMPTY", "光谱图名称不能为空"),
    SPECTRA_NOT_EXISTED("SPECTRA_NOT_EXISTED", "光谱数据为空"),
    SPECTRA_INSERT_ERROR("SPECTRA_INSERT_ERROR", "光谱数据插入失败"),
    BUILD_DECONV_SPECTRA_FAILED("BUILD_DECONV_SPECTRA_FAILED", "构建光谱图失败"),
    DECONV_SPECTRA_COUNT_MUST_MORE_THAN_4("DECONV_SPECTRA_COUNT_MUST_MORE_THAN_4", "构建新光谱所用的谱图数不得少于5张"),
    SPECIES_MATRIX_CID_CANNOT_BE_NULL("SPECIES_MATRIX_CID_CANNOT_BE_NULL","化合物的物种基质和CID不能为空"),

    /**
     * ******
     * Analyse
     * *******
     */
    COMPARISON_OVERVIEW_IDS_MUST_BIGGER_THAN_TWO("COMPARISON_OVERVIEW_IDS_MUST_BIGGER_THAN_TWO", "需要需要两个不同的数据分析ID才可以开始比对"),
    IDENTIFICATION_STATUS_NOT_VALID("IDENTIFICATION_STATUS_NOT_VALID", "鉴定状态码错误"),
    BINS_CANNOT_BE_EMPTY("BINS_CANNOT_BE_EMPTY", "Bins不能为空"),
    RECALCULATE_FAILED("RECALCULATE_FAILED", "重新计算RI失败"),

    /**
     * ******
     * TASK
     * *******
     */
    TASK_TEMPLATE_NOT_EXISTED("TASK_TEMPLATE_NOT_EXISTED", "任务模板不存在"),
    TASK_NOT_EXISTED("TASK_NOT_EXISTED", "任务不存在"),

    /**
     * ******
     * Aird Related
     * *******
     */
    CREATE_FILE_FAILED("CREATE_FILE_FAILED", "创建文件失败"),
    FILE_CHUNK_UPLOAD_FAILED("FILE_CHUNK_UPLOAD_FAILED","文件分片上传失败"),
    FILE_CHUNKS_MERGE_FAILED("FILE_CHUNKS_MERGE_FAILED","文件分片合并失败"),
    FILE_CHUNK_ALREADY_EXISTED("FILE_CHUNK_ALREADY_EXISTED","文件分片已存在"),
    FILE_CHUNK_NOT_EXISTED("FILE_CHUNK_NOT_EXISTED","文件分片不存在"),
    /**
     * ******
     * Project
     * ******
     */
    PROJECT_ID_CANNOT_BE_EMPTY("PROJECT_ID_CANNOT_BE_EMPTY", "项目id不能为空"),
    PROJECT_NAME_CANNOT_BE_EMPTY("PROJECT_NAME_CANNOT_BE_EMPTY", "项目名称不能为空"),
    PROJECT_NO_CANNOT_BE_EMPTY("PROJECT_NO_CANNOT_BE_EMPTY", "项目编号不能为空"),
    PROJECT_NOT_EXISTED("PROJECT_NOT_EXISTED", "项目不存在"),
    SAME_PROJECT_EXISTED("SAME_PROJECT_EXISTED", "存在同名项目"),
    SAME_PROJECT_NO_EXISTED("SAME_PROJECT_NO_EXISTED", "项目编号重复"),
    RUN_UNDER_PROJECT("RUN_UNDER_PROJECT", "项目下有Run数据"),
    NO_NEW_FILES_FOUND("NO_NEW_FILES_FOUND", "项目没有新的实验文件"),
    ALL_THE_OVERVIEW_MUST_BE_PREQC_TYPE("ALL_THE_OVERVIEW_MUST_BE_PREQC_TYPE","所有的overview都必须是PreQC类型"),

    /**
     * *******
     * sample
     * *******
     */
    SAMPLE_NO_CANNOT_BE_EMPTY("SAMPLE_NO_CANNOT_BE_EMPTY", "样本编号不能为空"),
    SAMPLE_SPECIES_CANNOT_BE_EMPTY("SAMPLE_SPECIES_CANNOT_BE_EMPTY", "样本物种不能为空"),
    SAMPLE_MATRIX_CANNOT_BE_EMPTY("SAMPLE_MATRIX_CANNOT_BE_EMPTY", "样本基质不能为空"),
    SAMPLE_GROUP_CANNOT_BE_EMPTY("SAMPLE_GROUP_CANNOT_BE_EMPTY", "样本组别不能为空"),
    SAME_SAMPLE_EXISTED("SAME_SAMPLE_EXISTED", "存在同名样本"),
    SAMPLE_NOT_EXISTED("SAMPLE_NOT_EXISTED", "样本库不存在该样本"),
    PRIORITY_CANNOT_BE_EMPTY("PRIORITY_CANNOT_BE_EMPTY", "优先级不能为空"),
    SAMPLE_LIST_IS_EMPTY("SAMPLE_LIST_IS_EMPTY", "样本列表为空"),
    UPLOAD_FILES_IS_NULL("UPLOAD_FILE_IS_NULL","上传样本数据为空"),

    FILES_TYPE_IS_INCORRECT("UPLOAD_FILE_IS_NULL","样本文件类型错误"),

    /**
     * ********
     * pre order
     * ********
     */
    PRE_ORDER_OWNER_CANNOT_BE_EMPTY("PRE_ORDER_OWNER_CANNOT_BE_EMPTY", "工单负责人不能为空"),
    PRE_ORDER_TYPE_CANNOT_BE_EMPTY("PRE_ORDER_TYPE_CANNOT_BE_EMPTY", "工单类型不能为空"),
    PRE_ORDER_ID_CANNOT_BE_EMPTY("PRE_ORDER_ID_CANNOT_BE_EMPTY", "工单id不能为空"),
    PRE_ORDER_IS_EMPTY("PRE_ORDER_IS_EMPTY", "工单不存在"),
    SAMPLE_POSITION_IS_EMPTY("SAMPLE_POSITION_IS_EMPTY", "样本位置为空"),
    SAMPLE_COUNT_CANNOT_BE_EMPTY("SAMPLE_COUNT_CANNOT_BE_EMPTY", "样本总数不能为空"),

    SAMPLE_SELECT_CANNOT_BE_EMPTY("SAMPLE_SELECT_CANNOT_BE_EMPTY", "样本勾选不能为空"),

    EXCEL_UPLOAD_CANNOT_BE_EMPTY("EXCEL_UPLOAD_CANNOT_BE_EMPTY", "excel文件不能为空"),


    /**
     * platform
     */
    PLATFORM_ID_CANNOT_BE_EMPTY("PLATFORM_ID_CANNOT_BE_EMPTY", "平台id不能为空"),
    PLATFORM_IS_EMPTY("PLATFORM_IS_EMPTY", "平台不存在"),

    FILE_NOT_FOUND("FILE_NOT_FOUND", "SOP文件不存在"),

    /**
     * standard
     */
    STANDARD_ID_CANNOT_BE_EMPTY("STANDARD_ID_CANNOT_BE_EMPTY", "标准品id不能为空"),
    STANDARD_IS_EMPTY("STANDARD_IS_EMPTY", "标准品不存在"),

    STANDARD_NO_CANNOT_BE_EMPTY("STANDARD_NO_CANNOT_BE_EMPTY", "标准品编号不能为空"),

    /**
     * device
     */
    DEVICE_ID_CANNOT_BE_EMPTY("DEVICE_ID_CANNOT_BE_EMPTY", "设备id不能为空"),
    DEVICE_IS_EMPTY("DEVICE_IS_EMPTY", "设备不存在"),

    DEVICE_NAME_HAS_EXIST("DEVICE_HAS_EXIST", "该设备名称在相应平台下已存在"),

    /**
     * ******
     * Batch
     * ******
     */
    BATCH_NAME_CANNOT_BE_EMPTY("BATCH_NAME_CANNOT_BE_EMPTY", "Batch名称不能为空"),
    BATCH_IS_NOT_EMPTY("BATCH_IS_NOT_EMPTY", "Batch非空"),
    BATCH_IS_EMPTY("BATCH_IS_EMPTY", "Batch为空"),
    BATCH_NOT_EXISTED("BATCH_NOT_EXISTED", "Batch不能为空"),
    BATCH_NAME_CHANGE_WHEN_SORT("BATCH_NAME_CHANGE_WHEN_SORT", "排序时batch名发生变化"),
    /**
     * ******
     * Platform
     * ******
     */
    PLATFORM_NOT_EXISTED("PLATFORM_NOT_EXISTED", "平台不存在"),
    SAME_PLATFORM_EXISTED("SAME_PLATFORM_EXISTED", "存在同名平台"),


    /**
     * ******
     * Config
     * ******
     */
    CONFIG_NO_CANNOT_BE_EMPTY("CONFIG_NO_CANNOT_BE_EMPTY", "配置编号不能为空"),
    CONFIG_NAME_CANNOT_BE_EMPTY("CONFIG_NAME_CANNOT_BE_EMPTY", "配置名称不能为空"),
    CONFIG_NO_ALREADY_EXISTED("CONFIG_ALREADY_EXIST", "配置已经存在"),


    /**
     * ******
     * msOrder
     * ******
     */
    MS_ORDER_VO_CANNOT_BE_EMPTY("MS_ORDER_VO_CANNOT_BE_EMPTY", "质谱工单入参不能为空"),
    MS_ORDER_OWNER_CANNOT_BE_EMPTY("MS_ORDER_OWNER_CANNOT_BE_EMPTY", "质谱工单负责人不能为空"),
    MS_ORDER_RUN_BOARD_CANNOT_BE_EMPTY("MS_ORDER_RUN_BOARD_CANNOT_BE_EMPTY", "请选择进样样本"),
    MS_ORDER_PROJECT_ID_CANNOT_BE_EMPTY("MS_ORDER_PROJECT_ID_CANNOT_BE_EMPTY", "projectId不能为空"),

    MS_ORDER_ID_CANNOT_BE_EMPTY("MS_ORDER_ID_CANNOT_BE_EMPTY", "Id不能为空"),

    MS_ORDER_SPEC_SAMPLE_METHOD_CANNOT_BE_EMPTY("MS_ORDER_SPEC_SAMPLE_METHOD_CANNOT_BE_EMPTY", "质谱工单设备及进样方式不能为空"),

    MS_ORDER_PRE_HEART_FREQUENCY_CANNOT_BE_EMPTY("MS_ORDER_PRE_HEART_FREQUENCY_CANNOT_BE_EMPTY", "预热频次不能为空"),

    MS_ORDER_PRE_HEART_ADDRESS_CANNOT_BE_EMPTY("MS_ORDER_PRE_HEART_ADDRESS_CANNOT_BE_EMPTY", "预热位置不能为空"),

    MS_ORDER_PRE_HEART_METHOD_CANNOT_BE_EMPTY("MS_ORDER_PRE_HEART_METHOD_CANNOT_BE_EMPTY", "预热方法不能为空"),


    /**
     * ******
     * Method
     * ******
     */
    METHOD_NAME_CANNOT_BE_EMPTY("METHOD_NAME_CANNOT_BE_EMPTY", "方法名称不能为空"),
    METHOD_NOT_EXISTED("METHOD_NOT_EXISTED", "方法不存在"),

    /**
     * CrossFilter
     */
    PROJECT_ID_CANNOT_BE_NULL("PROJECT_ID_CANNOT_BE_NULL","ProjectId不能为空"),
    LIBRARY_ID_CANNOT_BE_NULL("LIBRARY_ID_CANNOT_BE_NULL","LibraryId不能为空"),
    METHOD_ID_CANNOT_BE_NULL("METHOD_ID_CANNOT_BE_NULL","MethodId不能为空"),
    FILTER_PARAMS_CANNOT_BE_NULL("FILTER_PARAMS_CANNOT_BE_NULL","过滤参数不能为空"),
    RUN_CROSS_FILTER_FIRST("RUN_CROSS_FILTER_FIRST","请先执行交叉过滤"),
    CROSS_FILTER_ONLY_WORKS_FOR_ANA_LIBRARY("CROSS_FILTER_ONLY_WORKS_FOR_ANA_LIBRARY","交叉过滤模式仅在目标库下有效"),
    /**
     * ******
     * User
     * *******
     */
    USER_ALREADY_EXISTED("USER_ALREADY_EXISTED","该用户名已被注册"),
    OLD_PASSWORD_ERROR("OLD_PASSWORD_ERROR","原密码错误"),
    NEW_PASSWORD_NOT_EQUALS_WITH_REPEAT_PASSWORD("NEW_PASSWORD_NOT_EQUALS_WITH_REPEAT_PASSWORD","两次密码不一致"),
    USER_NOT_EXISTED("USER_NOT_EXISTED", "该用户不存在"),
    USER_NOT_LOGIN("USER_NOT_LOGIN", "用户未登录"),
    USERNAME_CANNOT_BE_USED("USERNAME_CANNOT_BE_USED", "该用户名不能被使用"),
    UNKNOWN_ACCOUNT("UNKNOWN_ACCOUNT", "未知的账户"),
    USERNAME_OR_PASSWORD_ERROR("USERNAME_OR_PASSWORD_ERROR", "未知的账户"),
    ACCOUNT_IS_LOCKED("ACCOUNT_IS_LOCKED", "账户已被锁定"),
    TRY_TOO_MANY_TIMES("TRY_TOO_MANY_TIMES", "尝试次数过多"),

    /**
     * Export
     */
    CREATE_EXPORT_FILE_FAILED("CREATE_EXPORT_FILE_FAILED","创建导出文件夹失败,请检查导出文件夹路径权限设置是否正确"),

    /**
     * ******
     * SQL-COMMON
     * *******
     */
    CONNECTION_URL_CANNOT_BE_EMPTY("CONNECTION_URL_CANNOT_BE_EMPTY", "数据库链接URL不能为空"),
    CONNECTION_FAILED("CONNECTION_FAILED", "数据库连接失败"),
    CONNECTION_SUCCESS("CONNECTION_SUCCESS", "数据库连接成功"),


    /**
     * ******
     * Integration
     * *******
     */
    INTEGRATION_FIELD_ERROR("INTEGRATION_FIELD_ERROR", "错误的积分范围"),

    ;

    private static final long serialVersionUID = -799302222165012777L;
    private String code = "";
    private String message = "";

    /**
     * @param code
     * @param message
     */
    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message + "(" + code + ")";
    }

}
