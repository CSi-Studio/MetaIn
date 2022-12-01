package net.csibio.injection.core.excel;

import lombok.extern.slf4j.Slf4j;
import net.csibio.injection.client.domain.db.MSOrderDO;
import net.csibio.injection.client.domain.query.MSOrderQuery;
import net.csibio.injection.client.domain.vo.msOrder.MsOrderHSXExcelVO;
import net.csibio.injection.client.service.IMSOrderService;
import net.csibio.injection.core.utils.ExcelManagerUtil;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MSOrderHFXExcelManager extends ExcelManagerUtil<MSOrderDO, MSOrderQuery, IMSOrderService, MsOrderHSXExcelVO> {
    public MSOrderHFXExcelManager(IMSOrderService imsOrderService) {
        super(imsOrderService);
    }
}
