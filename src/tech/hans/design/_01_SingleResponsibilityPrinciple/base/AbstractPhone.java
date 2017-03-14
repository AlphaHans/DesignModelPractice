package tech.hans.design._01_SingleResponsibilityPrinciple.base;

/**
 * Created by Hans on 17/3/14.
 */
public abstract class AbstractPhone implements IConnectManager, IDataTransfer {
    //可以定义其他,比如外貌的iPhone、AndroidPhone、WinPhone
    protected abstract void initAppearance();

    //电话的基本功能
    @Override
    public void dial(String phoneNum) {

    }

    @Override
    public void hangup() {

    }

    @Override
    public void translate(Object data) {

    }

}
