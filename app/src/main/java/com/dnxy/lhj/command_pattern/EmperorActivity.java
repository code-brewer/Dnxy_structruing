package com.dnxy.lhj.command_pattern;

import android.os.Bundle;
import android.support.annotation.Nullable;

import lhj.dnxy.com.common.base.BaseActivity;

/**
 * �������붼�Ǹ��Ƶģ�������ϸ�Ķ���
 * */

public class EmperorActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView();

        General general = new General();
        general.attach();
        general.undo();
        /**
         * ������������
         */
    }
}
