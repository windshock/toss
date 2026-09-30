package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProtoReader32Kt {
    /* renamed from: -forEachTag, reason: not valid java name */
    public static final TTBaseLandingPageActivity m126forEachTag(@NotNull ProtoReader32 protoReader32, @NotNull Function1<? super Integer, ? extends Object> function1) throws IOException {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int iBeginMessage = protoReader32.beginMessage();
        while (true) {
            int iNextTag = protoReader32.nextTag();
            if (iNextTag != -1) {
                function1.invoke(Integer.valueOf(iNextTag));
            } else {
                return protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
            }
        }
    }

    public static /* synthetic */ ProtoReader32 ProtoReader32$default(TTBaseLandingPageActivity tTBaseLandingPageActivity, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = tTBaseLandingPageActivity.access100();
        }
        return ProtoReader32(tTBaseLandingPageActivity, i2, i3);
    }

    public static final ProtoReader32 ProtoReader32(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return new ByteArrayProtoReader32(tTBaseLandingPageActivity.access000(), i2, i3);
    }

    public static /* synthetic */ ProtoReader32 ProtoReader32$default(byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bArr.length;
        }
        return ProtoReader32(bArr, i2, i3);
    }

    public static final ProtoReader32 ProtoReader32(@NotNull byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new ByteArrayProtoReader32(bArr, i2, i3);
    }
}
