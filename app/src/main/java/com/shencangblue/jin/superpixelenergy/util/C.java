/*
 * Copyright 2017 By_syk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shencangblue.jin.superpixelenergy.util;

import android.os.Build;


public class C {
    public static final int SDK = Build.VERSION.SDK_INT;

    public static final String LOG_TAG = "BIGJPG";

    public static final String BASE_URL_SERVER = "http://bigjpg.com/";
    public static final int BIGJPG_MAX_W = 3000;
    public static final int BIGJPG_MAX_H = 3000;
    public static final int BIGJPG_MAX_SIZE_0 = 2 * 1024 * 1024; // 2MB
    public static final int BIGJPG_MAX_SIZE_1 = 10 * 1024 * 1024; // 10MB
}
