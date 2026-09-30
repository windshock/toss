package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o.ModalBottomSheetKtExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda2 extends MenuKtExternalSyntheticLambda6 {
    public static final onExtraCallback onNavigationEvent = new onExtraCallback() { // from class: androidx.media3.extractor.metadata.id3.Id3Decoder$$ExternalSyntheticLambda0
        @Override // o.ModalBottomSheetKtExternalSyntheticLambda2.onExtraCallback
        public final boolean evaluate(int i2, int i3, int i4, int i5, int i6) {
            return ModalBottomSheetKtExternalSyntheticLambda2.onExtraCallback(i2, i3, i4, i5, i6);
        }
    };
    private final onExtraCallback onExtraCallback;

    public interface onExtraCallback {
        boolean evaluate(int i2, int i3, int i4, int i5, int i6);
    }

    public static /* synthetic */ boolean onExtraCallback(int i2, int i3, int i4, int i5, int i6) {
        return false;
    }

    private static int onNavigationEvent(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public ModalBottomSheetKtExternalSyntheticLambda2() {
        this(null);
    }

    public ModalBottomSheetKtExternalSyntheticLambda2(@Nullable onExtraCallback onextracallback) {
        this.onExtraCallback = onextracallback;
    }

    @Override // o.MenuKtExternalSyntheticLambda6
    public HandwritingHandlerNodeExternalSyntheticLambda0 onExtraCallbackWithResult(MenuKtExternalSyntheticLambda5 menuKtExternalSyntheticLambda5, ByteBuffer byteBuffer) {
        return onNavigationEvent(byteBuffer.array(), byteBuffer.limit());
    }

    public HandwritingHandlerNodeExternalSyntheticLambda0 onNavigationEvent(byte[] bArr, int i2) {
        ArrayList arrayList = new ArrayList();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr, i2);
        onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        if (onnavigationeventOnExtraCallback == null) {
            return null;
        }
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int i3 = onnavigationeventOnExtraCallback.onExtraCallback == 2 ? 6 : 10;
        int iIAuthTabCallbackStub = onnavigationeventOnExtraCallback.IAuthTabCallback;
        if (onnavigationeventOnExtraCallback.onExtraCallbackWithResult) {
            iIAuthTabCallbackStub = IAuthTabCallbackStub(textFieldDecoratorModifierNodeExternalSyntheticLambda20, onnavigationeventOnExtraCallback.IAuthTabCallback);
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(iOnWarmupCompleted + iIAuthTabCallbackStub);
        boolean z = false;
        if (!onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, onnavigationeventOnExtraCallback.onExtraCallback, i3, false)) {
            if (onnavigationeventOnExtraCallback.onExtraCallback != 4 || !onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, 4, i3, true)) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + onnavigationeventOnExtraCallback.onExtraCallback);
                return null;
            }
            z = true;
        }
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= i3) {
            ModalBottomSheetKtExternalSyntheticLambda5 modalBottomSheetKtExternalSyntheticLambda5IAuthTabCallback = IAuthTabCallback(onnavigationeventOnExtraCallback.onExtraCallback, textFieldDecoratorModifierNodeExternalSyntheticLambda20, z, i3, this.onExtraCallback);
            if (modalBottomSheetKtExternalSyntheticLambda5IAuthTabCallback != null) {
                arrayList.add(modalBottomSheetKtExternalSyntheticLambda5IAuthTabCallback);
            }
        }
        return new HandwritingHandlerNodeExternalSyntheticLambda0(arrayList);
    }

    private static onNavigationEvent onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 10) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady();
        if (iOnMessageChannelReady != 4801587) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iOnMessageChannelReady)));
            return null;
        }
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int iOnPostMessage = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onPostMessage();
        if (iOnMinimized == 2) {
            if ((iOnMinimized2 & 64) != 0) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iOnMinimized == 3) {
            if ((iOnMinimized2 & 64) != 0) {
                int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iAsBinder);
                iOnPostMessage -= iAsBinder + 4;
            }
        } else {
            if (iOnMinimized != 4) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iOnMinimized);
                return null;
            }
            if ((iOnMinimized2 & 64) != 0) {
                int iOnPostMessage2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onPostMessage();
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnPostMessage2 - 4);
                iOnPostMessage -= iOnPostMessage2;
            }
            if ((iOnMinimized2 & 16) != 0) {
                iOnPostMessage -= 10;
            }
        }
        return new onNavigationEvent(iOnMinimized, iOnMinimized < 4 && (iOnMinimized2 & 128) != 0, iOnPostMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0089 A[PHI: r3
      0x0089: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:39:0x0086, B:31:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3, boolean z) {
        int iOnMessageChannelReady;
        long jOnMessageChannelReady;
        int iOnUnminimized;
        int i4;
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        while (true) {
            try {
                boolean z2 = true;
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < i3) {
                    return true;
                }
                if (i2 >= 3) {
                    iOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
                    jOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
                    iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                } else {
                    iOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady();
                    jOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady();
                    iOnUnminimized = 0;
                }
                if (iOnMessageChannelReady == 0 && jOnMessageChannelReady == 0 && iOnUnminimized == 0) {
                    return true;
                }
                if (i2 == 4 && !z) {
                    if ((8421504 & jOnMessageChannelReady) != 0) {
                        return false;
                    }
                    jOnMessageChannelReady = (((jOnMessageChannelReady >> 16) & 255) << 14) | (jOnMessageChannelReady & 255) | (((jOnMessageChannelReady >> 8) & 255) << 7) | (((jOnMessageChannelReady >> 24) & 255) << 21);
                }
                if (i2 == 4) {
                    i4 = (iOnUnminimized & 64) != 0 ? 1 : 0;
                    if ((iOnUnminimized & 1) == 0) {
                        z2 = false;
                    }
                } else if (i2 == 3) {
                    i4 = (iOnUnminimized & 32) != 0 ? 1 : 0;
                    if ((iOnUnminimized & 128) == 0) {
                    }
                } else {
                    i4 = 0;
                    z2 = false;
                }
                if (z2) {
                    i4 += 4;
                }
                if (jOnMessageChannelReady < i4) {
                    return false;
                }
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < jOnMessageChannelReady) {
                    return false;
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault((int) jOnMessageChannelReady);
            } finally {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ec A[Catch: all -> 0x012a, Exception -> 0x012d, OutOfMemoryError -> 0x0130, TRY_LEAVE, TryCatch #2 {Exception -> 0x012d, OutOfMemoryError -> 0x0130, all -> 0x012a, blocks: (B:91:0x0118, B:93:0x0120, B:106:0x013f, B:108:0x0147, B:116:0x0161, B:125:0x0179, B:136:0x0194, B:143:0x01a6, B:149:0x01b5, B:154:0x01cd, B:160:0x01e7, B:161:0x01ec), top: B:171:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ModalBottomSheetKtExternalSyntheticLambda5 IAuthTabCallback(int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, boolean z, int i3, @Nullable onExtraCallback onextracallback) {
        int iOnMessageChannelReady;
        String str;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ModalBottomSheetKtExternalSyntheticLambda5 modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent;
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int iOnMinimized4 = i2 >= 3 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() : 0;
        if (i2 == 4) {
            iOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            if (!z) {
                iOnMessageChannelReady = (((iOnMessageChannelReady >> 16) & OggPageHeader.MAX_SEGMENT_COUNT) << 14) | (iOnMessageChannelReady & OggPageHeader.MAX_SEGMENT_COUNT) | (((iOnMessageChannelReady >> 8) & OggPageHeader.MAX_SEGMENT_COUNT) << 7) | ((iOnMessageChannelReady >>> 24) << 21);
            }
        } else if (i2 == 3) {
            iOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        } else {
            iOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady();
        }
        int iIAuthTabCallbackStub = iOnMessageChannelReady;
        int iOnUnminimized = i2 >= 3 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized() : 0;
        ModalBottomSheetKtExternalSyntheticLambda5 modalBottomSheetKtExternalSyntheticLambda5 = null;
        if (iOnMinimized == 0 && iOnMinimized2 == 0 && iOnMinimized3 == 0 && iOnMinimized4 == 0 && iIAuthTabCallbackStub == 0 && iOnUnminimized == 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult());
            return null;
        }
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + iIAuthTabCallbackStub;
        if (iOnWarmupCompleted > textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Id3Decoder", "Frame size exceeds remaining tag data");
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult());
            return null;
        }
        if (onextracallback != null) {
            str = "Id3Decoder";
            i4 = iOnWarmupCompleted;
            i5 = iOnUnminimized;
            if (!onextracallback.evaluate(i2, iOnMinimized, iOnMinimized2, iOnMinimized3, iOnMinimized4)) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i4);
                return null;
            }
        } else {
            str = "Id3Decoder";
            i4 = iOnWarmupCompleted;
            i5 = iOnUnminimized;
        }
        if (i2 == 3) {
            boolean z7 = (i5 & 128) != 0;
            z6 = (i5 & 64) != 0;
            z5 = false;
            z4 = z7;
            z3 = (i5 & 32) != 0;
            z2 = z4;
        } else if (i2 == 4) {
            z3 = (i5 & 64) != 0;
            boolean z8 = (i5 & 8) != 0;
            boolean z9 = (i5 & 4) != 0;
            z5 = (i5 & 2) != 0;
            z6 = z9;
            boolean z10 = z8;
            z4 = (i5 & 1) != 0;
            z2 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z6) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult(str, "Skipping unsupported compressed or encrypted frame");
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i4);
            return null;
        }
        if (z3) {
            iIAuthTabCallbackStub--;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        }
        if (z4) {
            iIAuthTabCallbackStub -= 4;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        }
        if (z5) {
            iIAuthTabCallbackStub = IAuthTabCallbackStub(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub);
        }
        try {
        } catch (Exception e) {
            e = e;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i4);
            if (modalBottomSheetKtExternalSyntheticLambda5 == null) {
            }
            return modalBottomSheetKtExternalSyntheticLambda5;
        } catch (OutOfMemoryError e2) {
            e = e2;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i4);
            if (modalBottomSheetKtExternalSyntheticLambda5 == null) {
            }
            return modalBottomSheetKtExternalSyntheticLambda5;
        } catch (Throwable th) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i4);
            throw th;
        }
        if (iOnMinimized == 84 && iOnMinimized2 == 88 && iOnMinimized3 == 88 && (i2 == 2 || iOnMinimized4 == 88)) {
            modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub);
        } else if (iOnMinimized == 84) {
            modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub, IAuthTabCallback(i2, iOnMinimized, iOnMinimized2, iOnMinimized3, iOnMinimized4));
        } else if (iOnMinimized == 87 && iOnMinimized2 == 88 && iOnMinimized3 == 88 && (i2 == 2 || iOnMinimized4 == 88)) {
            modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = IAuthTabCallbackDefault(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub);
        } else if (iOnMinimized == 87) {
            modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub, IAuthTabCallback(i2, iOnMinimized, iOnMinimized2, iOnMinimized3, iOnMinimized4));
        } else if (iOnMinimized == 80 && iOnMinimized2 == 82 && iOnMinimized3 == 73 && iOnMinimized4 == 86) {
            modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub);
        } else if (iOnMinimized == 71 && iOnMinimized2 == 69 && iOnMinimized3 == 79 && (iOnMinimized4 == 66 || i2 == 2)) {
            modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub);
        } else if (i2 == 2) {
            if (iOnMinimized == 80 && iOnMinimized2 == 73 && iOnMinimized3 == 67) {
                modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub, i2);
            }
            if (iOnMinimized != 67 && iOnMinimized2 == 79 && iOnMinimized3 == 77 && (iOnMinimized4 == 77 || i2 == 2)) {
                modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub);
            } else if (iOnMinimized != 67 && iOnMinimized2 == 72 && iOnMinimized3 == 65 && iOnMinimized4 == 80) {
                modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub, i2, z, i3, onextracallback);
            } else if (iOnMinimized != 67 && iOnMinimized2 == 84 && iOnMinimized3 == 79 && iOnMinimized4 == 67) {
                modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub, i2, z, i3, onextracallback);
            } else if (iOnMinimized != 77 && iOnMinimized2 == 76 && iOnMinimized3 == 76 && iOnMinimized4 == 84) {
                modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub);
            } else {
                modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub, IAuthTabCallback(i2, iOnMinimized, iOnMinimized2, iOnMinimized3, iOnMinimized4));
            }
        } else {
            if (iOnMinimized != 65 || iOnMinimized2 != 80 || iOnMinimized3 != 73 || iOnMinimized4 != 67) {
                if (iOnMinimized != 67) {
                    if (iOnMinimized != 67) {
                        if (iOnMinimized != 67) {
                            if (iOnMinimized != 77) {
                                modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub, IAuthTabCallback(i2, iOnMinimized, iOnMinimized2, iOnMinimized3, iOnMinimized4));
                            }
                        }
                    }
                }
                if (modalBottomSheetKtExternalSyntheticLambda5 == null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback(str, "Failed to decode frame: id=" + IAuthTabCallback(i2, iOnMinimized, iOnMinimized2, iOnMinimized3, iOnMinimized4) + ", frameSize=" + iIAuthTabCallbackStub, e);
                }
                return modalBottomSheetKtExternalSyntheticLambda5;
            }
            modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallbackStub, i2);
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i4);
        modalBottomSheetKtExternalSyntheticLambda5 = modalBottomSheetKtExternalSyntheticLambda5OnNavigationEvent;
        e = null;
        if (modalBottomSheetKtExternalSyntheticLambda5 == null) {
        }
        return modalBottomSheetKtExternalSyntheticLambda5;
    }

    private static ModalBottomSheetKtExternalSyntheticLambda9 onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        if (i2 <= 0) {
            return null;
        }
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i3);
        int iOnExtraCallback = onExtraCallback(bArr, 0, iOnMinimized);
        return new ModalBottomSheetKtExternalSyntheticLambda9("TXXX", new String(bArr, 0, iOnExtraCallback, onExtraCallbackWithResult(iOnMinimized)), onExtraCallbackWithResult(bArr, iOnMinimized, iOnExtraCallback + onNavigationEvent(iOnMinimized)));
    }

    private static ModalBottomSheetKtExternalSyntheticLambda9 onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, String str) {
        if (i2 <= 0) {
            return null;
        }
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i3);
        return new ModalBottomSheetKtExternalSyntheticLambda9(str, null, onExtraCallbackWithResult(bArr, iOnMinimized, 0));
    }

    private static ImmutableList<String> onExtraCallbackWithResult(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return ImmutableList.of("");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int iOnExtraCallback = onExtraCallback(bArr, i3, i2);
        while (i3 < iOnExtraCallback) {
            builder.add(new String(bArr, i3, iOnExtraCallback - i3, onExtraCallbackWithResult(i2)));
            i3 = onNavigationEvent(i2) + iOnExtraCallback;
            iOnExtraCallback = onExtraCallback(bArr, i3, i2);
        }
        ImmutableList<String> immutableListBuild = builder.build();
        return immutableListBuild.isEmpty() ? ImmutableList.of("") : immutableListBuild;
    }

    private static NavigationRailKtExternalSyntheticLambda0 IAuthTabCallbackDefault(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        if (i2 <= 0) {
            return null;
        }
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i3);
        int iOnExtraCallback = onExtraCallback(bArr, 0, iOnMinimized);
        String str = new String(bArr, 0, iOnExtraCallback, onExtraCallbackWithResult(iOnMinimized));
        int iOnNavigationEvent = iOnExtraCallback + onNavigationEvent(iOnMinimized);
        return new NavigationRailKtExternalSyntheticLambda0("WXXX", str, onWarmupCompleted(bArr, iOnNavigationEvent, IAuthTabCallback(bArr, iOnNavigationEvent), StandardCharsets.ISO_8859_1));
    }

    private static NavigationRailKtExternalSyntheticLambda0 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, String str) {
        byte[] bArr = new byte[i2];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i2);
        return new NavigationRailKtExternalSyntheticLambda0(str, null, new String(bArr, 0, IAuthTabCallback(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static ModalBottomSheetStateExternalSyntheticLambda0 onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        byte[] bArr = new byte[i2];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i2);
        int iIAuthTabCallback = IAuthTabCallback(bArr, 0);
        return new ModalBottomSheetStateExternalSyntheticLambda0(new String(bArr, 0, iIAuthTabCallback, StandardCharsets.ISO_8859_1), onNavigationEvent(bArr, iIAuthTabCallback + 1, i2));
    }

    private static ModalBottomSheetKtExternalSyntheticLambda3 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        Charset charsetOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnMinimized);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i3);
        int iIAuthTabCallback = IAuthTabCallback(bArr, 0);
        String str = (String) AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -750012447, 750012450, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{new String(bArr, 0, iIAuthTabCallback, StandardCharsets.ISO_8859_1)});
        int i4 = iIAuthTabCallback + 1;
        int iOnExtraCallback = onExtraCallback(bArr, i4, iOnMinimized);
        String strOnWarmupCompleted = onWarmupCompleted(bArr, i4, iOnExtraCallback, charsetOnExtraCallbackWithResult);
        int iOnNavigationEvent = iOnExtraCallback + onNavigationEvent(iOnMinimized);
        int iOnExtraCallback2 = onExtraCallback(bArr, iOnNavigationEvent, iOnMinimized);
        return new ModalBottomSheetKtExternalSyntheticLambda3(str, strOnWarmupCompleted, onWarmupCompleted(bArr, iOnNavigationEvent, iOnExtraCallback2, charsetOnExtraCallbackWithResult), onNavigationEvent(bArr, iOnExtraCallback2 + onNavigationEvent(iOnMinimized), i3));
    }

    private static ModalBottomSheetKtExternalSyntheticLambda12 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) {
        int iIAuthTabCallback;
        String str;
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        Charset charsetOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnMinimized);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i4);
        if (i3 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iIAuthTabCallback = 2;
        } else {
            iIAuthTabCallback = IAuthTabCallback(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, iIAuthTabCallback, StandardCharsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        byte b = bArr[iIAuthTabCallback + 1];
        int i5 = iIAuthTabCallback + 2;
        int iOnExtraCallback = onExtraCallback(bArr, i5, iOnMinimized);
        return new ModalBottomSheetKtExternalSyntheticLambda12(str, new String(bArr, i5, iOnExtraCallback - i5, charsetOnExtraCallbackWithResult), b & 255, onNavigationEvent(bArr, iOnExtraCallback + onNavigationEvent(iOnMinimized), i4));
    }

    private static ModalBottomSheetKtExternalSyntheticLambda4 onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        if (i2 < 4) {
            return null;
        }
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        Charset charsetOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnMinimized);
        byte[] bArr = new byte[3];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr2, 0, i3);
        int iOnExtraCallback = onExtraCallback(bArr2, 0, iOnMinimized);
        String str2 = new String(bArr2, 0, iOnExtraCallback, charsetOnExtraCallbackWithResult);
        int iOnNavigationEvent = iOnExtraCallback + onNavigationEvent(iOnMinimized);
        return new ModalBottomSheetKtExternalSyntheticLambda4(str, str2, onWarmupCompleted(bArr2, iOnNavigationEvent, onExtraCallback(bArr2, iOnNavigationEvent, iOnMinimized), charsetOnExtraCallbackWithResult));
    }

    private static ModalBottomSheetKtExternalSyntheticLambda13 onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3, boolean z, int i4, @Nullable onExtraCallback onextracallback) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted);
        String str = new String(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted, iIAuthTabCallback - iOnWarmupCompleted, StandardCharsets.ISO_8859_1);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iIAuthTabCallback + 1);
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        long jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        long j = jOnActivityResized == 4294967295L ? -1L : jOnActivityResized;
        long jOnActivityResized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        long j2 = jOnActivityResized2 == 4294967295L ? -1L : jOnActivityResized2;
        ArrayList arrayList = new ArrayList();
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() < iOnWarmupCompleted + i2) {
            ModalBottomSheetKtExternalSyntheticLambda5 modalBottomSheetKtExternalSyntheticLambda5IAuthTabCallback = IAuthTabCallback(i3, textFieldDecoratorModifierNodeExternalSyntheticLambda20, z, i4, onextracallback);
            if (modalBottomSheetKtExternalSyntheticLambda5IAuthTabCallback != null) {
                arrayList.add(modalBottomSheetKtExternalSyntheticLambda5IAuthTabCallback);
            }
        }
        return new ModalBottomSheetKtExternalSyntheticLambda13(str, iAsBinder, iAsBinder2, j, j2, (ModalBottomSheetKtExternalSyntheticLambda5[]) arrayList.toArray(new ModalBottomSheetKtExternalSyntheticLambda5[0]));
    }

    private static ModalBottomSheetKtExternalSyntheticLambda6 onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3, boolean z, int i4, @Nullable onExtraCallback onextracallback) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted);
        String str = new String(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted, iIAuthTabCallback - iOnWarmupCompleted, StandardCharsets.ISO_8859_1);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iIAuthTabCallback + 1);
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        boolean z2 = (iOnMinimized & 2) != 0;
        boolean z3 = (iOnMinimized & 1) != 0;
        int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        String[] strArr = new String[iOnMinimized2];
        for (int i5 = 0; i5 < iOnMinimized2; i5++) {
            int iOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            int iIAuthTabCallback2 = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted2);
            strArr[i5] = new String(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted2, iIAuthTabCallback2 - iOnWarmupCompleted2, StandardCharsets.ISO_8859_1);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iIAuthTabCallback2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() < iOnWarmupCompleted + i2) {
            ModalBottomSheetKtExternalSyntheticLambda5 modalBottomSheetKtExternalSyntheticLambda5IAuthTabCallback = IAuthTabCallback(i3, textFieldDecoratorModifierNodeExternalSyntheticLambda20, z, i4, onextracallback);
            if (modalBottomSheetKtExternalSyntheticLambda5IAuthTabCallback != null) {
                arrayList.add(modalBottomSheetKtExternalSyntheticLambda5IAuthTabCallback);
            }
        }
        return new ModalBottomSheetKtExternalSyntheticLambda6(str, z2, z3, strArr, (ModalBottomSheetKtExternalSyntheticLambda5[]) arrayList.toArray(new ModalBottomSheetKtExternalSyntheticLambda5[0]));
    }

    private static ModalBottomSheetKtExternalSyntheticLambda8 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        int iOnMessageChannelReady = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady();
        int iOnMessageChannelReady2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady();
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        int i3 = ((i2 - 10) << 3) / (iOnMinimized + iOnMinimized2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(iOnMinimized);
            int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(iOnMinimized2);
            iArr[i4] = iOnNavigationEvent;
            iArr2[i4] = iOnNavigationEvent2;
        }
        return new ModalBottomSheetKtExternalSyntheticLambda8(iOnUnminimized, iOnMessageChannelReady, iOnMessageChannelReady2, iArr, iArr2);
    }

    private static ModalBottomSheetKtExternalSyntheticLambda14 onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, String str) {
        byte[] bArr = new byte[i2];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i2);
        return new ModalBottomSheetKtExternalSyntheticLambda14(str, bArr);
    }

    private static int IAuthTabCallbackStub(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int i3 = iOnWarmupCompleted;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= iOnWarmupCompleted + i2) {
                return i2;
            }
            if ((bArrOnExtraCallback[i3] & 255) == 255 && bArrOnExtraCallback[i4] == 0) {
                System.arraycopy(bArrOnExtraCallback, i3 + 2, bArrOnExtraCallback, i4, (i2 - (i3 - iOnWarmupCompleted)) - 2);
                i2--;
            }
            i3 = i4;
        }
    }

    private static Charset onExtraCallbackWithResult(int i2) {
        if (i2 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i2 == 2) {
            return StandardCharsets.UTF_16BE;
        }
        if (i2 == 3) {
            return StandardCharsets.UTF_8;
        }
        return StandardCharsets.ISO_8859_1;
    }

    private static String IAuthTabCallback(int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    private static int onExtraCallback(byte[] bArr, int i2, int i3) {
        int iIAuthTabCallback = IAuthTabCallback(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iIAuthTabCallback;
        }
        while (iIAuthTabCallback < bArr.length - 1) {
            if ((iIAuthTabCallback - i2) % 2 == 0 && bArr[iIAuthTabCallback + 1] == 0) {
                return iIAuthTabCallback;
            }
            iIAuthTabCallback = IAuthTabCallback(bArr, iIAuthTabCallback + 1);
        }
        return bArr.length;
    }

    private static int IAuthTabCallback(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    private static byte[] onNavigationEvent(byte[] bArr, int i2, int i3) {
        if (i3 <= i2) {
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
        }
        return Arrays.copyOfRange(bArr, i2, i3);
    }

    private static String onWarmupCompleted(byte[] bArr, int i2, int i3, Charset charset) {
        if (i3 <= i2 || i3 > bArr.length) {
            return "";
        }
        return new String(bArr, i2, i3 - i2, charset);
    }

    static final class onNavigationEvent {
        private final int IAuthTabCallback;
        private final int onExtraCallback;
        private final boolean onExtraCallbackWithResult;

        public onNavigationEvent(int i2, boolean z, int i3) {
            this.onExtraCallback = i2;
            this.onExtraCallbackWithResult = z;
            this.IAuthTabCallback = i3;
        }
    }
}
