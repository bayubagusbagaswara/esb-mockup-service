package com.bayu.esbmockup.controller;

import com.bayu.esbmockup.util.DataObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/gw-transactionValas-api/transactionValas")
public class ForexController {

    @PostMapping("/valasFTTransaction")
    public Object transactionValas(){
        //response success
        String mock = "{\"result\":{\"debitValueDate\":\"20230512\",\"fxDocument\":\"001\",\"debitCurrency\":\"USD\",\"positionType\":\"TR\",\"debitCustomer\":null,\"currNo\":\"1\",\"fxPurpose\":\"01\",\"fedFunds\":\"NO\",\"creditCompCode\":\"ID0010516\",\"locAmtCredited\":\"72875.00\",\"ticketNo\":\"tIKET\",\"amountDebited\":\"USD5.00\",\"inputter\":[\"6868_TWSESBSPRAPSDEV1__WS___OFS_GCS\"],\"returnToDept\":\"NO\",\"wicFlag\":\"N\",\"toTrecChg\":\"0\",\"currencyMKTDR\":\"1\",\"stmtnos\":[\"203330686860781.00\",\"1-4\",\"1\",\"ID0010516\",\"203330686860781.01\",\"1-2\",\"ID0010497\",\"203330686860781.02\",\"1-2\",\"ID0010001\",\"203330686860781.03\",\"1-4\"],\"authDate\":\"20230512\",\"lastVersion\":\"FUNDS.TRANSFER,IDI.CASH.VALAS.TWS\",\"locAmtDebited\":\"73025.00\",\"toTrecComm\":\"0\",\"debitAmount\":\"5.00\",\"transactionId\":\"FT231328XVBP\",\"toTrecChgLcl\":\"0\",\"amountKredited\":\"IDR72875.00\",\"drAdviceReqDyn\":\"N\",\"crAdviceReqDyn\":\"N\",\"custGroupLevel\":\"99\",\"deptCode\":\"37\",\"chargeCode\":\"WAIVE\",\"dateTime\":[\"2309011652\"],\"processingDate\":\"20230512\",\"chargedCustomer\":\"81143865\",\"creditValueDate\":\"20230512\",\"msgId\":\"SDHSGD2734153\",\"creditCustomer\":\"81143865\",\"profitCentreCust\":\"83212416\",\"coCode\":\"ID0010002\",\"debitCompCode\":\"ID0010497\",\"commissionCode\":\"WAIVE\",\"roundType\":\"NATURAL\",\"rateFixing\":\"NO\",\"toTrecCommLcl\":\"0\",\"toTsndChgCrCcy\":\"0\",\"authoriser\":\"6868_TWSESBSPRAPSDEV1_WS____OFS_GCS\",\"transactionType\":\"AC79\",\"orderingBank\":[\"BSI\"],\"creditAcctNo\":\"7650001014\",\"currencyMKTCR\":\"1\",\"chargeComdisplay\":\"NO\",\"creditCurrency\":\"IDR\",\"debitAcctNo\":\"7657779991\",\"toTrecChgCrCcy\":\"0\"},\"referenceNo\":\"20230901045220526\",\"errorMessage\":\"Success\",\"errorCat\":\"Success\",\"additionalInfo\":{\"channel\":\"SUPERAPP\",\"deviceId\":\"81728993SGH\"},\"errorCode\":\"TWS-Success-200\",\"partnerReferenceNo\":\"SDHS87FF686732123\",\"responseMessage\":\"Success\",\"responseCode\":\"00\"}";
        //mock error
//        String mock = "{\"result\":null,\"referenceNo\":\"20230901045220526\",\"errorMessage\":\"Success\",\"errorCat\":\"Success\",\"additionalInfo\":{\"channel\":\"SUPERAPP\",\"deviceId\":\"81728993SGH\"},\"errorCode\":\"TWS-Success-200\",\"partnerReferenceNo\":\"SDHS87FF686732123\",\"responseMessage\":\"Success\",\"responseCode\":\"00\"}";
        return DataObject.fromJson(mock);
    }

}
