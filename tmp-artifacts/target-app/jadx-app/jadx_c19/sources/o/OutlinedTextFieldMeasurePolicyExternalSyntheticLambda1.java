package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.common.collect.ImmutableList;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldMeasurePolicyExternalSyntheticLambda1 {
    public static void onWarmupCompleted(int i2, @Nullable HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0, BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult, @Nullable HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda02, HandwritingHandlerNodeExternalSyntheticLambda0... handwritingHandlerNodeExternalSyntheticLambda0Arr) {
        if (handwritingHandlerNodeExternalSyntheticLambda02 == null) {
            handwritingHandlerNodeExternalSyntheticLambda02 = new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[0]);
        }
        if (handwritingHandlerNodeExternalSyntheticLambda0 != null) {
            for (int i3 = 0; i3 < handwritingHandlerNodeExternalSyntheticLambda0.onExtraCallback(); i3++) {
                HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback = handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i3);
                if (IAuthTabCallback instanceof TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0) {
                    TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 = (TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0) IAuthTabCallback;
                    if (!textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0.IAuthTabCallback.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS) || i2 == 2) {
                        handwritingHandlerNodeExternalSyntheticLambda02 = handwritingHandlerNodeExternalSyntheticLambda02.onWarmupCompleted(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0});
                    }
                }
            }
        }
        for (HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda03 : handwritingHandlerNodeExternalSyntheticLambda0Arr) {
            handwritingHandlerNodeExternalSyntheticLambda02 = handwritingHandlerNodeExternalSyntheticLambda02.onNavigationEvent(handwritingHandlerNodeExternalSyntheticLambda03);
        }
        if (handwritingHandlerNodeExternalSyntheticLambda02.onExtraCallback() > 0) {
            onextracallbackwithresult.onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda02);
        }
    }

    public static void onExtraCallbackWithResult(int i2, ElevationOverlayKtExternalSyntheticLambda1 elevationOverlayKtExternalSyntheticLambda1, BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult) {
        if (i2 == 1 && elevationOverlayKtExternalSyntheticLambda1.onExtraCallback()) {
            onextracallbackwithresult.onTransact(elevationOverlayKtExternalSyntheticLambda1.IAuthTabCallback).asBinder(elevationOverlayKtExternalSyntheticLambda1.onWarmupCompleted);
        }
    }

    public static HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        int i2 = iAsBinder >>> 24;
        try {
            if (i2 == 169 || i2 == 253) {
                int i3 = 16777215 & iAsBinder;
                if (i3 == 6516084) {
                    return IAuthTabCallback(iAsBinder, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (i3 == 7233901 || i3 == 7631467) {
                    return IAuthTabCallback(iAsBinder, "TIT2", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (i3 == 6516589 || i3 == 7828084) {
                    return IAuthTabCallback(iAsBinder, "TCOM", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (i3 == 6578553) {
                    return IAuthTabCallback(iAsBinder, "TDRC", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (i3 == 4280916) {
                    return IAuthTabCallback(iAsBinder, "TPE1", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (i3 == 7630703) {
                    return IAuthTabCallback(iAsBinder, "TSSE", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (i3 == 6384738) {
                    return IAuthTabCallback(iAsBinder, "TALB", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (i3 == 7108978) {
                    return IAuthTabCallback(iAsBinder, "USLT", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (i3 == 6776174) {
                    return IAuthTabCallback(iAsBinder, "TCON", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (i3 == 6779504) {
                    return IAuthTabCallback(iAsBinder, "TIT1", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
            } else {
                if (iAsBinder == 1735291493) {
                    return onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1684632427) {
                    return onNavigationEvent(iAsBinder, "TPOS", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1953655662) {
                    return onNavigationEvent(iAsBinder, "TRCK", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1953329263) {
                    return IAuthTabCallback(iAsBinder, "TBPM", textFieldDecoratorModifierNodeExternalSyntheticLambda20, true, false);
                }
                if (iAsBinder == 1668311404) {
                    return IAuthTabCallback(iAsBinder, "TCMP", textFieldDecoratorModifierNodeExternalSyntheticLambda20, true, true);
                }
                if (iAsBinder == 1668249202) {
                    return onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1631670868) {
                    return IAuthTabCallback(iAsBinder, "TPE2", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1936682605) {
                    return IAuthTabCallback(iAsBinder, "TSOT", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1936679276) {
                    return IAuthTabCallback(iAsBinder, "TSOA", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1936679282) {
                    return IAuthTabCallback(iAsBinder, "TSOP", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1936679265) {
                    return IAuthTabCallback(iAsBinder, "TSO2", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1936679791) {
                    return IAuthTabCallback(iAsBinder, "TSOC", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1920233063) {
                    return IAuthTabCallback(iAsBinder, "ITUNESADVISORY", textFieldDecoratorModifierNodeExternalSyntheticLambda20, false, false);
                }
                if (iAsBinder == 1885823344) {
                    return IAuthTabCallback(iAsBinder, "ITUNESGAPLESS", textFieldDecoratorModifierNodeExternalSyntheticLambda20, false, true);
                }
                if (iAsBinder == 1936683886) {
                    return IAuthTabCallback(iAsBinder, "TVSHOWSORT", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 1953919848) {
                    return IAuthTabCallback(iAsBinder, "TVSHOW", textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                }
                if (iAsBinder == 757935405) {
                    return onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted);
                }
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onNavigationEvent("MetadataUtil", "Skipped unknown metadata entry: " + TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback(iAsBinder));
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            return null;
        } finally {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
        }
    }

    public static TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, String str) {
        while (true) {
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            if (iOnWarmupCompleted >= i2) {
                return null;
            }
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1684108385) {
                int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
                int iAsBinder3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
                int i3 = iAsBinder - 16;
                byte[] bArr = new byte[i3];
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i3);
                return new TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0(str, bArr, iAsBinder3, iAsBinder2);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted + iAsBinder);
        }
    }

    public static TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 onExtraCallbackWithResult(HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0, String str) {
        for (int i2 = 0; i2 < handwritingHandlerNodeExternalSyntheticLambda0.onExtraCallback(); i2++) {
            HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback = handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i2);
            if (IAuthTabCallback instanceof TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0) {
                TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 = (TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0) IAuthTabCallback;
                if (textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0.IAuthTabCallback.equals(str)) {
                    return textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0;
                }
            }
        }
        return null;
    }

    private static ModalBottomSheetKtExternalSyntheticLambda9 IAuthTabCallback(int i2, String str, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1684108385) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
            return new ModalBottomSheetKtExternalSyntheticLambda9(str, null, ImmutableList.of(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult(iAsBinder - 16)));
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MetadataUtil", "Failed to parse text attribute: " + TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback(i2));
        return null;
    }

    private static ModalBottomSheetKtExternalSyntheticLambda4 IAuthTabCallback(int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1684108385) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
            String strOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult(iAsBinder - 16);
            return new ModalBottomSheetKtExternalSyntheticLambda4("und", strOnExtraCallbackWithResult, strOnExtraCallbackWithResult);
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MetadataUtil", "Failed to parse comment attribute: " + TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback(i2));
        return null;
    }

    private static ModalBottomSheetKtExternalSyntheticLambda5 IAuthTabCallback(int i2, String str, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, boolean z, boolean z2) {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        if (z2) {
            iOnExtraCallbackWithResult = Math.min(1, iOnExtraCallbackWithResult);
        }
        if (iOnExtraCallbackWithResult >= 0) {
            if (z) {
                return new ModalBottomSheetKtExternalSyntheticLambda9(str, null, ImmutableList.of(Integer.toString(iOnExtraCallbackWithResult)));
            }
            return new ModalBottomSheetKtExternalSyntheticLambda4("und", str, Integer.toString(iOnExtraCallbackWithResult));
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MetadataUtil", "Failed to parse uint8 attribute: " + TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback(i2));
        return null;
    }

    private static int onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1684108385) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
            int i2 = iAsBinder - 16;
            if (i2 == 1) {
                return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            }
            if (i2 == 2) {
                return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            }
            if (i2 == 3) {
                return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMessageChannelReady();
            }
            if (i2 == 4 && (textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault() & 128) == 0) {
                return textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            }
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static ModalBottomSheetKtExternalSyntheticLambda9 onNavigationEvent(int i2, String str, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1684108385 && iAsBinder >= 22) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(10);
            int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            if (iOnUnminimized > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iOnUnminimized);
                String string = sb.toString();
                int iOnUnminimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                if (iOnUnminimized2 > 0) {
                    string = string + "/" + iOnUnminimized2;
                }
                return new ModalBottomSheetKtExternalSyntheticLambda9(str, null, ImmutableList.of(string));
            }
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MetadataUtil", "Failed to parse index/count attribute: " + TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback(i2));
        return null;
    }

    private static ModalBottomSheetKtExternalSyntheticLambda9 onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        String strOnNavigationEvent = ModalBottomSheetKtScrimdismissModifier11ExternalSyntheticLambda0.onNavigationEvent(onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20) - 1);
        if (strOnNavigationEvent != null) {
            return new ModalBottomSheetKtExternalSyntheticLambda9("TCON", null, ImmutableList.of(strOnNavigationEvent));
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static ModalBottomSheetKtExternalSyntheticLambda12 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        String str;
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() != 1684108385) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iIAuthTabCallback = OutlinedTextFieldKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        if (iIAuthTabCallback == 13) {
            str = "image/jpeg";
        } else {
            str = iIAuthTabCallback == 14 ? "image/png" : null;
        }
        if (str == null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MetadataUtil", "Unrecognized cover art flags: " + iIAuthTabCallback);
            return null;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        int i2 = iAsBinder - 16;
        byte[] bArr = new byte[i2];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i2);
        return new ModalBottomSheetKtExternalSyntheticLambda12(str, null, 3, bArr);
    }

    private static ModalBottomSheetKtExternalSyntheticLambda5 onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        String strOnExtraCallbackWithResult = null;
        String strOnExtraCallbackWithResult2 = null;
        int i3 = -1;
        int i4 = -1;
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() < i2) {
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
            if (iAsBinder2 == 1835360622) {
                strOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult(iAsBinder - 12);
            } else if (iAsBinder2 == 1851878757) {
                strOnExtraCallbackWithResult2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult(iAsBinder - 12);
            } else {
                if (iAsBinder2 == 1684108385) {
                    i3 = iOnWarmupCompleted;
                    i4 = iAsBinder;
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iAsBinder - 12);
            }
        }
        if (strOnExtraCallbackWithResult == null || strOnExtraCallbackWithResult2 == null || i3 == -1) {
            return null;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i3);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(16);
        return new ModalBottomSheetKtExternalSyntheticLambda7(strOnExtraCallbackWithResult, strOnExtraCallbackWithResult2, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult(i4 - 16));
    }
}
