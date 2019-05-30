package com.santander.integration.modulea;

import javax.inject.Inject;

public class MyPresenter {

    @Inject
    MyDatabase db;

    MyPresenter() {
        FragmentA1.getMyComponent().inject(this);
    }
}
