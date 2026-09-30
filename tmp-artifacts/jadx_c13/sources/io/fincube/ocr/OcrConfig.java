package io.fincube.ocr;

import android.content.Context;
import io.fincube.ocrsdk.OcrConfigSDK;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OcrConfig extends OcrConfigSDK {
    public static final int IDCARD_TYPE_ALIEN = 4;
    public static final int IDCARD_TYPE_DRIVELICENSE = 2;
    public static final int IDCARD_TYPE_IDENTIFICATION = 1;
    public static final int IDCARD_TYPE_PASSPORT = 5;
    public static final int IDCARD_TYPE_UNKOWN = 0;
    public static final int USE_BACK_CAMERA = 0;
    public static final int USE_FRONT_CAMERA = 1;
    public Context context;
    public int customPreviewDegrees;
    public boolean tryColorTest;
    public int guideColor = -16777216;
    public boolean changeOverlayColor = true;
    public int guideBackgroundColorDefault = -1140850689;
    public int guideBackgroundColorDetect = -1157627904;
    public int cameraIdx = 0;
    public boolean useCustomPreviewDegree = false;
    public boolean autoReleaseCamera = true;

    public boolean setGuideLine(int i, int i2, int i3, int i4) {
        this.guide_x = i;
        this.guide_y = i2;
        this.guide_w = i3;
        this.guide_h = i4;
        return true;
    }
}
