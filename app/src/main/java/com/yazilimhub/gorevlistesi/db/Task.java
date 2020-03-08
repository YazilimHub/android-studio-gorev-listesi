package com.yazilimhub.gorevlistesi.db;

import android.provider.BaseColumns;

public class Task {
    public static final String DB_NAME="com.yazilimhub.gorevlistesi.db";
    public static final int DB_VERSION = 2;

    public class TaskEntry implements BaseColumns{
        public static final String TABLE ="tasks";
        public static final String COL_TASK_TITLE ="title";
    }
}
