package o;

import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity {
    private static final char[] onNavigationEvent = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final char[] onExtraCallback() {
        return onNavigationEvent;
    }

    public static final void onWarmupCompleted(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @NotNull TTBaseActivity tTBaseActivity, int i, int i2) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        tTBaseActivity.onExtraCallback(tTBaseLandingPageActivity.onWarmupCompleted(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0183, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        r6 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0090, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f4, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int onExtraCallbackWithResult(byte[] bArr, int i) {
        byte b;
        int i2;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                int i6 = i4 + 1;
                if (i4 == i) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i5 += b2 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i4 = i6;
                    if (i3 < length && (b = bArr[i3]) >= 0) {
                        i3++;
                        i6 = i4 + 1;
                        if (i4 != i) {
                            if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                                break loop0;
                            }
                            i5 += b < 65536 ? 1 : 2;
                        } else {
                            return i5;
                        }
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length > i7) {
                    byte b3 = bArr[i7];
                    if ((b3 & 192) == 128) {
                        int i8 = (b2 << 6) ^ (b3 ^ ByteCompanionObject.MIN_VALUE);
                        if (i8 >= 128) {
                            if (i4 == i) {
                                break;
                            }
                            if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                break;
                            }
                            i5 += i8 < 65536 ? 1 : 2;
                            Unit unit = Unit.INSTANCE;
                            i3 += 2;
                            i4++;
                        } else if (i4 != i) {
                            return -1;
                        }
                    } else if (i4 != i) {
                        return -1;
                    }
                } else if (i4 != i) {
                    return -1;
                }
            } else if ((b2 >> 4) == -2) {
                int i9 = i3 + 2;
                if (length > i9) {
                    byte b4 = bArr[i3 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i9];
                        if ((b5 & 192) == 128) {
                            int i10 = (b2 << 12) ^ ((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6));
                            if (i10 < 2048) {
                                if (i4 != i) {
                                    return -1;
                                }
                            } else if (55296 > i10 || i10 >= 57344) {
                                i2 = i4 + 1;
                                if (i4 == i) {
                                    break;
                                }
                                if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                    break;
                                }
                                i5 += i10 < 65536 ? 1 : 2;
                                Unit unit2 = Unit.INSTANCE;
                                i3 += 3;
                                i4 = i2;
                            } else if (i4 != i) {
                                return -1;
                            }
                        } else if (i4 != i) {
                            return -1;
                        }
                    } else if (i4 != i) {
                        return -1;
                    }
                } else if (i4 != i) {
                    return -1;
                }
            } else if ((b2 >> 3) == -2) {
                int i11 = i3 + 3;
                if (length > i11) {
                    byte b6 = bArr[i3 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i3 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i11];
                            if ((b8 & 192) == 128) {
                                int i12 = (b2 << 18) ^ (((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6)) ^ (b6 << 12));
                                if (i12 > 1114111) {
                                    if (i4 != i) {
                                        return -1;
                                    }
                                } else if (55296 > i12 || i12 >= 57344) {
                                    if (i12 >= 65536) {
                                        i2 = i4 + 1;
                                        if (i4 == i) {
                                            break;
                                        }
                                        if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                            break;
                                        }
                                        i5 += i12 < 65536 ? 1 : 2;
                                        Unit unit3 = Unit.INSTANCE;
                                        i3 += 4;
                                        i4 = i2;
                                    } else if (i4 != i) {
                                        return -1;
                                    }
                                } else if (i4 != i) {
                                    return -1;
                                }
                            } else if (i4 != i) {
                                return -1;
                            }
                        } else if (i4 != i) {
                            return -1;
                        }
                    } else if (i4 != i) {
                        return -1;
                    }
                } else if (i4 != i) {
                    return -1;
                }
            } else if (i4 != i) {
                return -1;
            }
        }
        return -1;
    }
}
