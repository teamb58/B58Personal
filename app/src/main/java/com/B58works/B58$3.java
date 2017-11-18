package com.B58works;

import android.view.View;

import java.io.IOException;

/**
 * Created by Bharath.R(58) on 18-11-2017.
 */

public class B58$3 implements View.OnClickListener {
    public void $m$0(final View view) throws IOException {
        try {
            B58$4.a(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void onClick(final View view) {
        try {
            this.$m$0(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
