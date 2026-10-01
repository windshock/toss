package com.bytedance.sdk.openadsdk.core.ry.lt.ycx;

import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.oty.sya;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.Objects;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends zb {
    private JSONObject zb;
    private static final byte[] $$a = {40, 108, -113, 75};
    private static final int $$b = 208;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent = 478308895;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b * 2;
        int i4 = 105 - (s2 * 4);
        int i5 = s + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i3;
            i2 = 0;
            int i8 = i6;
            i4 = i5 + (-i7);
            i5 = i8;
            int i9 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i9];
            int i10 = i4;
            i6 = i9;
            i5 = i10;
            int i82 = i6;
            i4 = i5 + (-i7);
            i5 = i82;
            int i92 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            int i922 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dj(tn tnVar, com.bytedance.sdk.openadsdk.core.ry.lt.ycx ycxVar) {
        super(tnVar);
        tnVar.pk();
        int i2 = 2;
        try {
        } catch (JSONException e) {
            sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs35BY0k6fX6IpWOU4hQ==", "dP4omyK4S8aDQcJNuBStOFfvOZA=", "B+cjnBfi", 63);
            int i3 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % i2 == 0) {
            }
        }
        if (tnVar.pvm() == 1) {
            this.zb = new JSONObject("{\n  \"custom_components\": {\n    \"445\": \"{\\\"id\\\":\\\"a679ab\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"${((xSize.height-xSize.creativeHeight-xSize.paddingVertical) * xSize.imageModeRatio  < (xSize.width-xSize.creativeWidth-xSize.paddingHorizontal)) || ((xSize.width-xSize.creativeWidth-xSize.paddingHorizontal) / xSize.imageModeRatio > (xSize.height-xSize.creativeHeight-xSize.paddingVertical)) ? 'wrap_content' : 'match_parent'}\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"height\\\":\\\"${((xSize.height-xSize.creativeHeight-xSize.paddingVertical) * xSize.imageModeRatio  < (xSize.width-xSize.creativeWidth-xSize.paddingHorizontal)) || ((xSize.width-xSize.creativeWidth-xSize.paddingHorizontal) / xSize.imageModeRatio > (xSize.height-xSize.creativeHeight-xSize.paddingVertical)) ? 'match_parent' : 'wrap_content'}\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"17b03e\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"setWidth\\\":true,\\\"enableRatio\\\":true,\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"ratio\\\":\\\"${xSize.imageModeRatio}\\\",\\\"visibility\\\":\\\"${((xSize.height-xSize.creativeHeight-xSize.paddingVertical) * xSize.imageModeRatio < (xSize.width-xSize.creativeWidth-xSize.paddingHorizontal)) || ((xSize.width-xSize.creativeWidth-xSize.paddingHorizontal) / xSize.imageModeRatio > (xSize.height-xSize.creativeHeight-xSize.paddingVertical)) ? 'hidden' : 'visible'}\\\",\\\"children\\\":[{\\\"id\\\":\\\"b26d2d\\\",\\\"type\\\":\\\"Video\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"src\\\":\\\"${video.video_url}\\\",\\\"autoplay\\\":true,\\\"visibility\\\":\\\"${xAdInfo.isVideoImageMode==true || playable_type == 0 ? 'visible' : 'hidden'}\\\"},{\\\"id\\\":\\\"48d460\\\",\\\"type\\\":\\\"Image\\\",\\\"width\\\":\\\"match_parent\\\",\\\"src\\\":\\\"${image[0].url}\\\",\\\"flexShrink\\\":0,\\\"visibility\\\":\\\"${xAdInfo.feed_draw_purePlayable==true || xAdInfo.isVideoImageMode?'hidden':'visible'}\\\",\\\"height\\\":\\\"match_parent\\\",\\\"scaleMode\\\":\\\"fit\\\"}],\\\"justifyContent\\\":\\\"center\\\"},{\\\"id\\\":\\\"80af82\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"ratio\\\":\\\"${xSize.imageModeRatio}\\\",\\\"setHeight\\\":true,\\\"enableRatio\\\":true,\\\"visibility\\\":\\\"${((xSize.height-xSize.creativeHeight-xSize.paddingVertical)* xSize.imageModeRatio < (xSize.width-xSize.creativeWidth-xSize.paddingHorizontal)) || ((xSize.width-xSize.creativeWidth-xSize.paddingHorizontal) / xSize.imageModeRatio > (xSize.height-xSize.creativeHeight-xSize.paddingVertical)) ? 'visible' : 'hidden'}\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"17a9d0\\\",\\\"type\\\":\\\"Video\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"src\\\":\\\"${video.video_url}\\\",\\\"autoplay\\\":true,\\\"visibility\\\":\\\"${xAdInfo.isVideoImageMode==true || playable_type == 0 ? 'visible' : 'hidden'}\\\"},{\\\"id\\\":\\\"74b20b\\\",\\\"type\\\":\\\"Image\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"src\\\":\\\"${image[0].url}\\\",\\\"flexShrink\\\":0,\\\"visibility\\\":\\\"${xAdInfo.feed_draw_purePlayable==true || xAdInfo.isVideoImageMode?'hidden':'visible'}\\\"}],\\\"justifyContent\\\":\\\"center\\\"}],\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://preventEvent\\\"]}]}\",\n    \"432\": \"{\\\"id\\\":\\\"0e9149\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"deb941\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"b8c142\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"a9c17d\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"892130\\\",\\\"type\\\":\\\"Image\\\",\\\"width\\\":54,\\\"src\\\":\\\"${icon.url}\\\",\\\"enableRatio\\\":true,\\\"ratio\\\":1,\\\"setHeight\\\":false,\\\"borderRadius\\\":5,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"borderStyle\\\":\\\"solid\\\",\\\"borderColor\\\":\\\"rgba(0,0,0,0.08)\\\",\\\"borderWidth\\\":1}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"flexShrink\\\":0,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}]},{\\\"id\\\":\\\"29aef9\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"4d5c7d\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${exist(source,app.app_name)}\\\",\\\"textSize\\\":17,\\\"textAlign\\\":\\\"left\\\",\\\"textColor\\\":\\\"#3b3c40\\\",\\\"fontWeight\\\":600,\\\"letterSpacing\\\":1,\\\"ellipsis\\\":\\\"end\\\",\\\"maxLines\\\":1,\\\"paddingSpread\\\":\\\"expand\\\",\\\"marginSpread\\\":\\\"expand\\\",\\\"visibility\\\":\\\"visible\\\",\\\"textStyle\\\":\\\"normal\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"minTextSize\\\":14},{\\\"id\\\":\\\"b999fd\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${title}\\\",\\\"textSize\\\":14,\\\"textAlign\\\":\\\"left\\\",\\\"textColor\\\":\\\"rgba(22,24,35,0.5019607843137255)\\\",\\\"fontWeight\\\":400,\\\"ellipsis\\\":\\\"end\\\",\\\"maxLines\\\":2,\\\"paddingSpread\\\":\\\"expand\\\",\\\"marginSpread\\\":\\\"expand\\\",\\\"visibility\\\":\\\"visible\\\",\\\"paddingTop\\\":4,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"minTextSize\\\":12}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"overflow\\\":\\\"hidden\\\",\\\"marginSpread\\\":\\\"expand\\\",\\\"marginLeft\\\":12,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}]}],\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"flex_start\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}]},{\\\"id\\\":\\\"0ce64a\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"44\\\",\\\"text\\\":\\\"${button_text}\\\",\\\"ellipsis\\\":\\\"end\\\",\\\"textSize\\\":16,\\\"textColor\\\":\\\"#ffffff\\\",\\\"backgroundColor\\\":\\\"#0974e6\\\",\\\"borderColor\\\":\\\"#0974e6\\\",\\\"borderStyle\\\":\\\"solid\\\",\\\"borderWidth\\\":1,\\\"paddingSpread\\\":\\\"expand\\\",\\\"paddingTop\\\":11.5,\\\"paddingBottom\\\":11.5,\\\"paddingLeft\\\":5,\\\"paddingRight\\\":5,\\\"borderRadius\\\":6,\\\"marginTop\\\":20,\\\"fontWeight\\\":500,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}]}],\\\"justifyContent\\\":\\\"center\\\"}\",\n    \"42\": \"{\\\"id\\\":\\\"f39bf2\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"6f7eef\\\",\\\"type\\\":\\\"Icon\\\",\\\"width\\\":14,\\\"height\\\":6,\\\"src\\\":\\\"${'logo'}\\\",\\\"textColor\\\":\\\"rgba(255,255,255,0.5)\\\",\\\"visibility\\\":\\\"${ad_label == null ?  'visible' : (ad_label.icon == null || ad_label.icon == '' ? 'hidden':'visible')}\\\"},{\\\"id\\\":\\\"affc09\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${ad_label == null || ad_label.text == null || ad_label.text == '' ? 'AD' : ad_label.text }\\\",\\\"textSize\\\":10,\\\"marginSpread\\\":\\\"expand\\\",\\\"marginLeft\\\":2,\\\"visibility\\\":\\\"visible\\\",\\\"scaleX\\\":0.8,\\\"scaleY\\\":0.8,\\\"textColor\\\":\\\"rgba(255,255,255,0.75)\\\"}],\\\"justifyContent\\\":\\\"center\\\",\\\"paddingSpread\\\":\\\"expand\\\",\\\"paddingTop\\\":1,\\\"paddingBottom\\\":1,\\\"paddingLeft\\\":2,\\\"paddingRight\\\":2,\\\"borderRadius\\\":2,\\\"backgroundColor\\\":\\\"rgba(0,0,0,0.15)\\\",\\\"visibility\\\":\\\"${'visible'}\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://openPrivacy\\\"]}]}\",\n    \"580\": \"{\\\"id\\\":\\\"e88547\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"081480\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"50c2e5\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":28,\\\"height\\\":28,\\\"children\\\":[{\\\"id\\\":\\\"5d471c\\\",\\\"type\\\":\\\"Icon\\\",\\\"width\\\":18,\\\"height\\\":18,\\\"src\\\":\\\"feedback\\\",\\\"textColor\\\":\\\"#ffffff\\\"}],\\\"justifyContent\\\":\\\"center\\\",\\\"alignItems\\\":\\\"center\\\",\\\"alignSelf\\\":\\\"center\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"borderRadius\\\":14,\\\"backgroundColor\\\":\\\"rgba(51,51,51,0.6)\\\",\\\"enableRatio\\\":false,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://dislike\\\"]}],\\\"borderWidth\\\":0.5,\\\"borderColor\\\":\\\"rgba(255,255,255,0.2)\\\",\\\"borderStyle\\\":\\\"solid\\\",\\\"marginSpread\\\":\\\"expand\\\",\\\"flexShrink\\\":0}],\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"flex_start\\\"},{\\\"id\\\":\\\"1530f3\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"06345f\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":29,\\\"children\\\":[{\\\"id\\\":\\\"e446ca\\\",\\\"type\\\":\\\"AOSkipView\\\",\\\"width\\\":28,\\\"height\\\":28,\\\"children\\\":[{\\\"id\\\":\\\"6a727f\\\",\\\"type\\\":\\\"Icon\\\",\\\"width\\\":18,\\\"height\\\":18,\\\"src\\\":\\\"close\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"margin\\\":5}],\\\"backgroundColor\\\":\\\"rgba(51,51,51,0.6)\\\",\\\"borderRadius\\\":28,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://skip\\\"]}],\\\"borderWidth\\\":0.5,\\\"borderStyle\\\":\\\"solid\\\",\\\"borderColor\\\":\\\"rgba(255,255,255,0.2)\\\"},{\\\"id\\\":\\\"56d5b3\\\",\\\"type\\\":\\\"AOCountdown\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":28,\\\"textSize\\\":14,\\\"after\\\":\\\"s\\\",\\\"fontWeight\\\":400,\\\"backgroundColor\\\":\\\"rgba(51,51,51,0.6)\\\",\\\"paddingSpread\\\":\\\"expand\\\",\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"textColor\\\":\\\"#ffffff\\\",\\\"borderWidth\\\":0.5,\\\"borderColor\\\":\\\"rgba(255,255,255,0.2)\\\",\\\"borderStyle\\\":\\\"solid\\\",\\\"borderRadius\\\":44,\\\"lineHeight\\\":28,\\\"textAlign\\\":\\\"center\\\"}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"flexShrink\\\":0}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"flexShrink\\\":0}],\\\"justifyContent\\\":\\\"flex_start\\\",\\\"paddingSpread\\\":\\\"expand\\\",\\\"paddingLeft\\\":16,\\\"paddingRight\\\":13,\\\"paddingTop\\\":27,\\\"paddingBottom\\\":24,\\\"visibility\\\":\\\"${xSetting.bar_render_platform == 1?'hidden':'visible'}\\\"}\"\n  },\n  \"data\": \"{\\\"meta\\\":{},\\\"body\\\":{\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"backgroundColor\\\":\\\"#ffffff\\\",\\\"type\\\":\\\"View\\\",\\\"id\\\":\\\"471698\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"targetId\\\":\\\"445\\\",\\\"borderRadius\\\":8,\\\"id\\\":\\\"b7adb4\\\",\\\"targetProps\\\":{},\\\"type\\\":\\\"CustomComponent\\\",\\\"components\\\":[\\\"445\\\"],\\\"width\\\":\\\"match_parent\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"alignItems\\\":\\\"center\\\"},{\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"targetProps\\\":{},\\\"flexShrink\\\":0,\\\"marginTop\\\":16,\\\"id\\\":\\\"859b11\\\",\\\"type\\\":\\\"CustomComponent\\\",\\\"components\\\":[\\\"432\\\"],\\\"justifyContent\\\":\\\"center\\\",\\\"targetId\\\":\\\"432\\\",\\\"alignItems\\\":\\\"center\\\"},{\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"targetId\\\":\\\"42\\\",\\\"targetProps\\\":{},\\\"left\\\":16,\\\"width\\\":\\\"wrap_content\\\",\\\"components\\\":[],\\\"type\\\":\\\"CustomComponent\\\",\\\"position\\\":\\\"absolute\\\",\\\"id\\\":\\\"38c0c1\\\",\\\"bottom\\\":16,\\\"height\\\":\\\"wrap_content\\\"},{\\\"top\\\":0,\\\"width\\\":\\\"match_parent\\\",\\\"id\\\":\\\"9667e9\\\",\\\"type\\\":\\\"CustomComponent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"components\\\":[],\\\"position\\\":\\\"absolute\\\",\\\"targetProps\\\":{},\\\"left\\\":0,\\\"flexDirection\\\":\\\"column\\\",\\\"targetId\\\":\\\"580\\\"}],\\\"padding\\\":45}}\",\n  \"id\": \"400013145\",\n  \"md5\": \"89f6fd3599fb3f7160803fda0a628c7b\"}");
        } else {
            this.zb = new JSONObject("{\n  \"custom_components\": {\n    \"445\": \"{\\\"id\\\":\\\"a679ab\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"${((xSize.height-xSize.creativeHeight-xSize.paddingVertical) * xSize.imageModeRatio  < (xSize.width-xSize.creativeWidth-xSize.paddingHorizontal)) || ((xSize.width-xSize.creativeWidth-xSize.paddingHorizontal) / xSize.imageModeRatio > (xSize.height-xSize.creativeHeight-xSize.paddingVertical)) ? 'wrap_content' : 'match_parent'}\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"height\\\":\\\"${((xSize.height-xSize.creativeHeight-xSize.paddingVertical) * xSize.imageModeRatio  < (xSize.width-xSize.creativeWidth-xSize.paddingHorizontal)) || ((xSize.width-xSize.creativeWidth-xSize.paddingHorizontal) / xSize.imageModeRatio > (xSize.height-xSize.creativeHeight-xSize.paddingVertical)) ? 'match_parent' : 'wrap_content'}\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"17b03e\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"setWidth\\\":true,\\\"enableRatio\\\":true,\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"ratio\\\":\\\"${xSize.imageModeRatio}\\\",\\\"visibility\\\":\\\"${((xSize.height-xSize.creativeHeight-xSize.paddingVertical) * xSize.imageModeRatio  < (xSize.width-xSize.creativeWidth-xSize.paddingHorizontal)) || ((xSize.width-xSize.creativeWidth-xSize.paddingHorizontal) / xSize.imageModeRatio > (xSize.height-xSize.creativeHeight-xSize.paddingVertical)) ? 'hidden' : 'visible'}\\\",\\\"children\\\":[{\\\"id\\\":\\\"b26d2d\\\",\\\"type\\\":\\\"Video\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"src\\\":\\\"${video.video_url}\\\",\\\"autoplay\\\":true,\\\"visibility\\\":\\\"${xAdInfo.isVideoImageMode==true || playable_type == 0 ? 'visible' : 'hidden'}\\\"},{\\\"id\\\":\\\"48d460\\\",\\\"type\\\":\\\"Image\\\",\\\"width\\\":\\\"match_parent\\\",\\\"src\\\":\\\"${image[0].url}\\\",\\\"flexShrink\\\":0,\\\"visibility\\\":\\\"${xAdInfo.feed_draw_purePlayable==true || xAdInfo.isVideoImageMode?'hidden':'visible'}\\\",\\\"height\\\":\\\"match_parent\\\",\\\"scaleMode\\\":\\\"fit\\\"}],\\\"justifyContent\\\":\\\"center\\\"},{\\\"id\\\":\\\"80af82\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"ratio\\\":\\\"${xSize.imageModeRatio}\\\",\\\"setHeight\\\":true,\\\"enableRatio\\\":true,\\\"visibility\\\":\\\"${((xSize.height-xSize.creativeHeight-xSize.paddingVertical)* xSize.imageModeRatio < (xSize.width-xSize.creativeWidth-xSize.paddingHorizontal)) || ((xSize.width-xSize.creativeWidth-xSize.paddingHorizontal) / xSize.imageModeRatio > (xSize.height-xSize.creativeHeight-xSize.paddingVertical)) ? 'visible' : 'hidden'}\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"17a9d0\\\",\\\"type\\\":\\\"Video\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"src\\\":\\\"${video.video_url}\\\",\\\"autoplay\\\":true,\\\"visibility\\\":\\\"${xAdInfo.isVideoImageMode==true || playable_type == 0 ? 'visible' : 'hidden'}\\\"},{\\\"id\\\":\\\"74b20b\\\",\\\"type\\\":\\\"Image\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"src\\\":\\\"${image[0].url}\\\",\\\"flexShrink\\\":0,\\\"visibility\\\":\\\"${xAdInfo.feed_draw_purePlayable==true || xAdInfo.isVideoImageMode?'hidden':'visible'}\\\"}],\\\"justifyContent\\\":\\\"center\\\"}],\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://preventEvent\\\"]}]}\",\n    \"443\": \"{\\\"id\\\":\\\"8f0aeb\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_end\\\",\\\"children\\\":[{\\\"id\\\":\\\"7f4578\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"9ab265\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"562752\\\",\\\"type\\\":\\\"Image\\\",\\\"width\\\":56,\\\"src\\\":\\\"${icon.url}\\\",\\\"enableRatio\\\":true,\\\"ratio\\\":1,\\\"setHeight\\\":false,\\\"borderRadius\\\":5,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"borderStyle\\\":\\\"solid\\\",\\\"borderColor\\\":\\\"rgba(0,0,0,0.08)\\\",\\\"borderWidth\\\":1}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"flexShrink\\\":0,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}]},{\\\"id\\\":\\\"bf64f3\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"348b54\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${exist(source,app.app_name)}\\\",\\\"textSize\\\":17,\\\"textAlign\\\":\\\"left\\\",\\\"textColor\\\":\\\"#3b3c40\\\",\\\"fontWeight\\\":600,\\\"ellipsis\\\":\\\"end\\\",\\\"maxLines\\\":2,\\\"paddingSpread\\\":\\\"expand\\\",\\\"marginSpread\\\":\\\"expand\\\",\\\"visibility\\\":\\\"visible\\\",\\\"textStyle\\\":\\\"normal\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"minTextSize\\\":14},{\\\"id\\\":\\\"b8f145\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${title}\\\",\\\"textSize\\\":14,\\\"textAlign\\\":\\\"left\\\",\\\"textColor\\\":\\\"rgba(22,24,35,0.5019607843137255)\\\",\\\"fontWeight\\\":400,\\\"ellipsis\\\":\\\"end\\\",\\\"paddingSpread\\\":\\\"expand\\\",\\\"marginSpread\\\":\\\"expand\\\",\\\"visibility\\\":\\\"visible\\\",\\\"paddingTop\\\":8,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"minTextSize\\\":12,\\\"maxLines\\\":3}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"overflow\\\":\\\"hidden\\\",\\\"marginSpread\\\":\\\"expand\\\",\\\"marginTop\\\":12},{\\\"id\\\":\\\"b29021\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"42\\\",\\\"text\\\":\\\"${button_text}\\\",\\\"ellipsis\\\":\\\"end\\\",\\\"textSize\\\":16,\\\"textColor\\\":\\\"#ffffff\\\",\\\"backgroundColor\\\":\\\"#0974e6\\\",\\\"borderColor\\\":\\\"#0974e6\\\",\\\"borderStyle\\\":\\\"solid\\\",\\\"borderWidth\\\":1,\\\"paddingSpread\\\":\\\"expand\\\",\\\"paddingTop\\\":11,\\\"paddingBottom\\\":11,\\\"paddingLeft\\\":5,\\\"paddingRight\\\":5,\\\"borderRadius\\\":6,\\\"marginTop\\\":20,\\\"fontWeight\\\":500,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\"}],\\\"justifyContent\\\":\\\"center\\\",\\\"backgroundColor\\\":\\\"#ffffff\\\",\\\"paddingLeft\\\":16,\\\"paddingRight\\\":16}\",\n    \"42\": \"{\\\"id\\\":\\\"f39bf2\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"6f7eef\\\",\\\"type\\\":\\\"Icon\\\",\\\"width\\\":14,\\\"height\\\":6,\\\"src\\\":\\\"${'logo'}\\\",\\\"textColor\\\":\\\"rgba(255,255,255,0.5)\\\",\\\"visibility\\\":\\\"${ad_label == null ?  'visible' : (ad_label.icon == null || ad_label.icon == '' ? 'hidden':'visible')}\\\"},{\\\"id\\\":\\\"affc09\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${ad_label == null || ad_label.text == null || ad_label.text == '' ? 'AD' : ad_label.text }\\\",\\\"textSize\\\":10,\\\"marginSpread\\\":\\\"expand\\\",\\\"marginLeft\\\":2,\\\"visibility\\\":\\\"visible\\\",\\\"scaleX\\\":0.8,\\\"scaleY\\\":0.8,\\\"textColor\\\":\\\"rgba(255,255,255,0.75)\\\"}],\\\"justifyContent\\\":\\\"center\\\",\\\"paddingSpread\\\":\\\"expand\\\",\\\"paddingTop\\\":1,\\\"paddingBottom\\\":1,\\\"paddingLeft\\\":2,\\\"paddingRight\\\":2,\\\"borderRadius\\\":2,\\\"backgroundColor\\\":\\\"rgba(0,0,0,0.15)\\\",\\\"visibility\\\":\\\"${'visible'}\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://openPrivacy\\\"]}]}\",\n    \"580\": \"{\\\"id\\\":\\\"e88547\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"081480\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"50c2e5\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":28,\\\"height\\\":28,\\\"children\\\":[{\\\"id\\\":\\\"5d471c\\\",\\\"type\\\":\\\"Icon\\\",\\\"width\\\":18,\\\"height\\\":18,\\\"src\\\":\\\"feedback\\\",\\\"textColor\\\":\\\"#ffffff\\\"}],\\\"justifyContent\\\":\\\"center\\\",\\\"alignItems\\\":\\\"center\\\",\\\"alignSelf\\\":\\\"center\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"borderRadius\\\":14,\\\"backgroundColor\\\":\\\"rgba(51,51,51,0.6)\\\",\\\"enableRatio\\\":false,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://dislike\\\"]}],\\\"borderWidth\\\":0.5,\\\"borderColor\\\":\\\"rgba(255,255,255,0.2)\\\",\\\"borderStyle\\\":\\\"solid\\\",\\\"marginSpread\\\":\\\"expand\\\",\\\"flexShrink\\\":0}],\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"flex_start\\\"},{\\\"id\\\":\\\"1530f3\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"06345f\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":29,\\\"children\\\":[{\\\"id\\\":\\\"e446ca\\\",\\\"type\\\":\\\"AOSkipView\\\",\\\"width\\\":28,\\\"height\\\":28,\\\"children\\\":[{\\\"id\\\":\\\"6a727f\\\",\\\"type\\\":\\\"Icon\\\",\\\"width\\\":18,\\\"height\\\":18,\\\"src\\\":\\\"close\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"margin\\\":5}],\\\"backgroundColor\\\":\\\"rgba(51,51,51,0.6)\\\",\\\"borderRadius\\\":28,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://skip\\\"]}],\\\"borderWidth\\\":0.5,\\\"borderStyle\\\":\\\"solid\\\",\\\"borderColor\\\":\\\"rgba(255,255,255,0.2)\\\"},{\\\"id\\\":\\\"56d5b3\\\",\\\"type\\\":\\\"AOCountdown\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":28,\\\"textSize\\\":14,\\\"after\\\":\\\"s\\\",\\\"fontWeight\\\":400,\\\"backgroundColor\\\":\\\"rgba(51,51,51,0.6)\\\",\\\"paddingSpread\\\":\\\"expand\\\",\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"textColor\\\":\\\"#ffffff\\\",\\\"borderWidth\\\":0.5,\\\"borderColor\\\":\\\"rgba(255,255,255,0.2)\\\",\\\"borderStyle\\\":\\\"solid\\\",\\\"borderRadius\\\":44,\\\"lineHeight\\\":28,\\\"textAlign\\\":\\\"center\\\"}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"flexShrink\\\":0}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"flexShrink\\\":0}],\\\"justifyContent\\\":\\\"flex_start\\\",\\\"paddingSpread\\\":\\\"expand\\\",\\\"paddingLeft\\\":16,\\\"paddingRight\\\":13,\\\"paddingTop\\\":27,\\\"paddingBottom\\\":24,\\\"visibility\\\":\\\"${xSetting.bar_render_platform == 1?'hidden':'visible'}\\\"}\"\n  },\n  \"data\": \"{\\\"meta\\\":{},\\\"body\\\":{\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"padding\\\":45,\\\"alignItems\\\":\\\"center\\\",\\\"height\\\":\\\"match_parent\\\",\\\"type\\\":\\\"View\\\",\\\"children\\\":[{\\\"id\\\":\\\"0bb430\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"components\\\":[\\\"445\\\"],\\\"type\\\":\\\"CustomComponent\\\",\\\"targetProps\\\":{},\\\"justifyContent\\\":\\\"center\\\",\\\"borderRadius\\\":8,\\\"width\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"targetId\\\":\\\"445\\\"}],\\\"flexDirection\\\":\\\"column\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"width\\\":\\\"match_parent\\\",\\\"id\\\":\\\"edb7c8\\\"},{\\\"components\\\":[\\\"443\\\"],\\\"padding\\\":16,\\\"flexDirection\\\":\\\"row\\\",\\\"targetId\\\":\\\"443\\\",\\\"backgroundColor\\\":\\\"#ffffff\\\",\\\"alignItems\\\":\\\"center\\\",\\\"ratio\\\":0.74,\\\"type\\\":\\\"CustomComponent\\\",\\\"targetProps\\\":{},\\\"height\\\":\\\"match_parent\\\",\\\"id\\\":\\\"0f060a\\\",\\\"justifyContent\\\":\\\"center\\\"},{\\\"alignItems\\\":\\\"flex_start\\\",\\\"targetProps\\\":{},\\\"flexDirection\\\":\\\"column\\\",\\\"id\\\":\\\"de47c7\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"components\\\":[\\\"580\\\"],\\\"position\\\":\\\"absolute\\\",\\\"type\\\":\\\"CustomComponent\\\",\\\"width\\\":\\\"match_parent\\\",\\\"targetId\\\":\\\"580\\\",\\\"top\\\":0,\\\"left\\\":0},{\\\"targetProps\\\":{},\\\"bottom\\\":12,\\\"height\\\":\\\"wrap_content\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"components\\\":[\\\"42\\\"],\\\"targetId\\\":\\\"42\\\",\\\"id\\\":\\\"bfbc5f\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"type\\\":\\\"CustomComponent\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"position\\\":\\\"absolute\\\",\\\"left\\\":12}],\\\"backgroundColor\\\":\\\"#ffffff\\\",\\\"height\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"id\\\":\\\"75095d\\\"}}\",\n  \"id\": \"400013146\",\n  \"md5\": \"fddab5e65c90c708cf4fca808cd8401e\"}");
            int i4 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i4 % 128;
            i2 = i4 % 2 == 0 ? 2 % 2 : i2 % i2;
        }
        JSONObject jSONObject = this.zb;
        if (jSONObject != null) {
            jSONObject.optString(TtmlNode.ATTR_ID);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ry.lt.ycx.zb
    public String ycx() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        JSONObject jSONObject = this.zb;
        if (jSONObject == null) {
            int i3 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int defaultSize = 5 >> View.getDefaultSize(0, 0);
            ViewConfiguration.getGlobalActionKeyTimeout();
            Object[] objArr = new Object[1];
            a(defaultSize, 0, new char[]{65531, 65534, 65531, 14}, false, TextUtils.indexOf("", "", 1) * 13921, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(View.getDefaultSize(0, 0) + 4, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, new char[]{65531, 65534, 65531, 14}, true, TextUtils.indexOf("", "", 0) + 156, objArr2);
            obj = objArr2[0];
        }
        return jSONObject.optString(((String) obj).intern());
    }

    @Override // com.bytedance.sdk.openadsdk.core.ry.lt.ycx.zb
    public JSONObject zb() {
        int i2 = 2 % 2;
        JSONObject jSONObject = this.zb;
        if (jSONObject == null) {
            return null;
        }
        int i3 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("custom_components");
        int i5 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return jSONObjectOptJSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ry.lt.ycx.zb
    public void ycx(JSONObject jSONObject) throws JSONException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            super.ycx(jSONObject);
            if (jSONObject == null) {
                return;
            }
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("xSize");
                if (jSONObjectOptJSONObject != null) {
                    if (this.ycx.pvm() == 1) {
                        int i4 = onExtraCallbackWithResult + 125;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            jSONObjectOptJSONObject.put("creativeHeight", 12337);
                            jSONObjectOptJSONObject.put("creativeWidth", 0);
                            jSONObjectOptJSONObject.put("paddingHorizontal", 90.0d);
                        } else {
                            jSONObjectOptJSONObject.put("creativeHeight", 128);
                            jSONObjectOptJSONObject.put("creativeWidth", 0);
                            jSONObjectOptJSONObject.put("paddingHorizontal", 90.0d);
                        }
                        jSONObjectOptJSONObject.put("paddingVertical", 90.0d);
                    } else {
                        jSONObjectOptJSONObject.put("creativeHeight", 0);
                        jSONObjectOptJSONObject.put("creativeWidth", dc.fby(pmi.ycx()) * 0.74f);
                        jSONObjectOptJSONObject.put("paddingHorizontal", 90.0d);
                        jSONObjectOptJSONObject.put("paddingVertical", 90.0d);
                    }
                }
                Objects.toString(jSONObjectOptJSONObject);
                return;
            } catch (JSONException e) {
                sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs35BY0k6fX6IpWOU4hQ==", "dP4omyK4S8aDQcJNuBStOFfvOZA=", "Wv49kA24XMCFRPNcmBA=", 108);
                return;
            }
        }
        super.ycx(jSONObject);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        int i6;
        Throwable cause;
        int i7 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = -1;
            i6 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 10278 - (ViewConfiguration.getPressedStateDuration() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 55 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2167 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i9 = $10 + 75;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i11 = $10 + 45;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) i5;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16790059), 54 - TextUtils.lastIndexOf("", '0', 0), 2167 - KeyEvent.getDeadChar(0, 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = -1;
                i6 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
