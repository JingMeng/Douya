/*
 * Copyright (c) 2017 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package androidx.appcompat.app;

import android.content.res.Resources;

public class NightModeAccessor {

    private NightModeAccessor() {}

    public static boolean flushResources(Resources resources) {
        ResourcesFlusher.flush(resources);
        return true;
    }

    public static int mapNightMode(AppCompatDelegate delegate, int mode) {
        // We don't care about APIs below 14.
        return ((AppCompatDelegateImpl) delegate).mapNightMode(mode);
    }
}
