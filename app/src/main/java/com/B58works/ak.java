package com.B58works;

import android.view.View;

/**
 * Created by Bharath.R(58) on 18-11-2017.
 */

public class ak {
    private final String a;

    public ak(final String a) {
        this.a = a;
    }

    public void onClick(final View view) {
        B58.a(this.a, view);
    }
}
