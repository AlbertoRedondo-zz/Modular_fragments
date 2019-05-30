package com.santander.integration.modulea;

import dagger.Component;

@Component(modules={ContextModule.class})

public interface MyComponent {
    void inject(MyPresenter presenter);
}
