package com.B58works;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Bharath.R(58) on 18-11-2017.
 */

public class aa {
    private final TextView a;

    public aa(final TextView a) {
        this.a = a;
    }

    public void onClick(final View view) {
        B58.status(this.a, view);
    }
}
