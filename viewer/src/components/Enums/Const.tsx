import {Space} from "antd";
import {CloseSquareOutlined, TabletFilled} from "@ant-design/icons";

export const Polarity = {
  Negative: { text: 'Negative', value: 'Negative' },
  Positive: { text: 'Positive', value: 'Positive' },
};

export const RunType = {
  SAM: { text: 'SAM', value: 'SAM' },
  REF: { text: 'REF', value: 'REF' },
  MIX: { text: 'MIX', value: 'MIX' },
  BLK: { text: 'BLK', value: 'BLK' },
};

export const MsType = {
  PROFILE: { text: 'PROFILE', value: 'PROFILE' },
  CENTROIDED: { text: 'CENTROIDED', value: 'CENTROIDED' },
};

export const SampleRandomMethod = {
  1: { text: '板子随机', value: 1 },
  2: { text: '样本随机', value: 2 },
};

export const BalanceMethodEnum = {
  '1': 'Random Balance',
  '2': 'Stratified Balance'
}

export const RandomMethodEnum = {
  '1': 'Simple Random',
  '2': 'Block Random'
}

export const DimsEnum = {
  '1': 'dim1',
  '2': 'dim2',
  '3': 'dim3',
}

export const PlateNumber = {
  'LETTER_NUMBER': 'A-Z',
  'NUMBER_NUMBER': '1-N'
}

export const QCColors = {
  'Custom': 'pink',
  'LTR': '#2db7f5',
  'Pooled': '#87d068',
  'Solvent': '#0094ff',
  'Blank': '#00ff65',
}

export const QCType = {

  '1': <Space><TabletFilled style={{ fontSize: '16px', color: QCColors.Custom }}/>Custom QC</Space>,
  '2': <Space><TabletFilled style={{ fontSize: '16px', color: QCColors.LTR }}/>Long-Term Reference QC</Space>,
  '3': <Space><TabletFilled style={{ fontSize: '16px', color: QCColors.Pooled }}/>Pooled QC</Space>,
  '4': <Space><TabletFilled style={{ fontSize: '16px', color: QCColors.Solvent }}/>Solvent QC</Space>,
  '5': <Space><TabletFilled style={{ fontSize: '16px', color: QCColors.Blank }}/>Blank QC</Space>,
  '6': <Space><CloseSquareOutlined />Clear</Space>,
}

export const PlateTypeEnum = {
  '1': '81 well (9*9)',
  '2': '96 well (8*12)',
  '3': '384 well (16*24)'
}

export const SampleAddType1 = {
  1: { text: '人工录入', value: 1 },
  2: { text: '样本勾选', value: 2 },
  3: { text: 'Excel导入', value: 3 },
};
export const SampleAddType = [
  { label: '人工录入', value: 1 },
  { label: '样本勾选', value: 2 },
  { label: 'Excel导入', value: 3 },
];

export const PlateType = {
  1: { text: '9*9样本板', value: 1 },
  2: { text: '96孔板', value: 2 },
  3: { text: 'ep管', value: 3 },
};

export const SampleBoardType = {
  2: { text: '96孔板', value: 2 },
  4: { text: 'ep管', value: 4 },
};

export const PlatformStatus = {
  '1': { text: 'Online', value: '1' },
  '2': { text: 'Offline', value: '2' },
};

export const Template = {
  SCAN_AND_UPDATE_RUNS: { text: 'Scan Runs', value: 'SCAN_AND_UPDATE_RUNS' },
  UPLOAD_LIBRARY_FILE: { text: 'Upload Library', value: 'UPLOAD_LIBRARY_FILE' },
  EXTRACTOR: { text: 'XIC', value: 'EXTRACTOR' },
  LIBRARY_PUSH: { text: 'Push Library', value: 'LIBRARY_PUSH' },
  TARGET_ANALYZE_WITH_RT: { text: 'RT Targeted Analysis', value: 'TARGET_ANALYZE_WITH_RT' },
  TARGET_ANALYZE_WITH_RI: { text: 'RI Targeted Analysis', value: 'TARGET_ANALYZE_WITH_RI' },
  PRE_QC: { text: 'PreQC', value: 'PRE_QC' },
  RI_CALIBRATION: { text: 'RI Calibration', value: 'RI_CALIBRATION' },
  BUILD_LIBRARY: { text: 'Build Library', value: 'BUILD_LIBRARY' },
};

export const SupportPlatForm = {
  pos: { text: 'pos', value: 'pos' },
  neg: { text: 'neg', value: 'neg' },
  HILIC: { text: 'HILIC', value: 'HILIC' },
  lippos: { text: 'lippos', value: 'lippos' },
  GC: { text: 'GC', value: 'GC' },
};

export const DeviceType = {
  '6500+': { text: '6500+', value: '6500+' },
  "HF": { text: 'HF', value: 'HF' },
  'HFX-1': { text: 'HFX-1', value: 'HFX-1' },
  'HFX-2': { text: 'HFX-2', value: 'HFX-2' },
  'GCMS-1': { text: 'GCMS-1', value: 'GCMS-1' },
  'GCMS-2': { text: 'GCMS-2', value: 'GCMS-2' },
};
