package com.codelean.access;

public class CodeLeanA {
    public void methodPublic(){
        methodPrivate();
    }
    protected void methodProtected(){
        methodPrivate();
    }
    void methodDefaul(){
        methodDefaul();
    }
    private void methodPrivate(){}
}
