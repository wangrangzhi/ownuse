package io.github.wangrangzhi.processdefinition.service;

public interface ProcessdefinitionService {
    void SERIALIZABLE();

    void REPEATABLE_READ();

    void READ_COMMITTED();

    void READ_UNCOMMITTED();

    void rn() throws InterruptedException;

     void testone();

    void hutoolpool();
    void tran() throws InterruptedException;
}
