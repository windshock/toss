package o;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RenderersFactory;
import java.util.ArrayList;
import o.AlertDialogKtAlertDialogFlowRow11ExternalSyntheticLambda0;
import o.AnchoredDraggableStateExternalSyntheticLambda4;
import o.AndroidMenu_androidKtExternalSyntheticLambda4;
import o.DraggableAnchorsNodeExternalSyntheticLambda0;
import o.SelectionManagerExternalSyntheticLambda8;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextStringSimpleNodeExternalSyntheticLambda2 implements RenderersFactory {
    private final AndroidMenu_androidKtExternalSyntheticLambda3 IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStubProxy;
    private boolean asBinder;
    private boolean onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onTransact;
    private int asInterface = 0;
    private long onWarmupCompleted = 5000;
    private AppBarKtExternalSyntheticLambda6 access000 = AppBarKtExternalSyntheticLambda6.onExtraCallback;
    private long IAuthTabCallbackStub = -9223372036854775807L;

    public TextStringSimpleNodeExternalSyntheticLambda2(Context context) {
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallback = new AndroidMenu_androidKtExternalSyntheticLambda3(context);
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer[] IAuthTabCallback(Handler handler, DrawerKtExternalSyntheticLambda15 drawerKtExternalSyntheticLambda15, SelectionManagerExternalSyntheticLambda5 selectionManagerExternalSyntheticLambda5, ChipKtExternalSyntheticLambda4 chipKtExternalSyntheticLambda4, BackdropScaffoldKtExternalSyntheticLambda11 backdropScaffoldKtExternalSyntheticLambda11) {
        ArrayList<Renderer> arrayList = new ArrayList<>();
        onExtraCallbackWithResult(this.onExtraCallbackWithResult, this.asInterface, this.access000, this.onNavigationEvent, handler, drawerKtExternalSyntheticLambda15, this.onWarmupCompleted, arrayList);
        SelectionManagerExternalSyntheticLambda2 selectionManagerExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted(this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault, this.onExtraCallback);
        if (selectionManagerExternalSyntheticLambda2OnWarmupCompleted != null) {
            onWarmupCompleted(this.onExtraCallbackWithResult, this.asInterface, this.access000, this.onNavigationEvent, selectionManagerExternalSyntheticLambda2OnWarmupCompleted, handler, selectionManagerExternalSyntheticLambda5, arrayList);
        }
        onExtraCallbackWithResult(this.onExtraCallbackWithResult, chipKtExternalSyntheticLambda4, handler.getLooper(), this.asInterface, arrayList);
        IAuthTabCallback(this.onExtraCallbackWithResult, backdropScaffoldKtExternalSyntheticLambda11, handler.getLooper(), this.asInterface, arrayList);
        onWarmupCompleted(this.onExtraCallbackWithResult, this.asInterface, arrayList);
        onExtraCallbackWithResult(this.onExtraCallbackWithResult, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    protected void onExtraCallbackWithResult(Context context, int i2, AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, boolean z, Handler handler, DrawerKtExternalSyntheticLambda15 drawerKtExternalSyntheticLambda15, long j, ArrayList<Renderer> arrayList) {
        int i3;
        int i4;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        DraggableAnchorsNodeExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = new DraggableAnchorsNodeExternalSyntheticLambda0.onNavigationEvent(context).onExtraCallback(onNavigationEvent()).onNavigationEvent(appBarKtExternalSyntheticLambda6).onExtraCallback(j).onExtraCallback(z).onExtraCallback(handler).onWarmupCompleted(drawerKtExternalSyntheticLambda15).IAuthTabCallback(50).onNavigationEvent(this.IAuthTabCallbackStubProxy).onExtraCallbackWithResult(this.IAuthTabCallbackStub);
        if (Build.VERSION.SDK_INT >= 34) {
            onnavigationeventOnExtraCallbackWithResult = onnavigationeventOnExtraCallbackWithResult.onWarmupCompleted(this.asBinder);
        }
        arrayList.add(onnavigationeventOnExtraCallbackWithResult.onExtraCallbackWithResult());
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                try {
                    i3 = size + 1;
                    try {
                        arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, DrawerKtExternalSyntheticLambda15.class, cls).newInstance(Long.valueOf(j), handler, drawerKtExternalSyntheticLambda15, 50));
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i3;
                        i3 = size;
                        try {
                            i4 = i3 + 1;
                            arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, DrawerKtExternalSyntheticLambda15.class, cls).newInstance(Long.valueOf(j), handler, drawerKtExternalSyntheticLambda15, 50));
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                            arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, DrawerKtExternalSyntheticLambda15.class, cls).newInstance(Long.valueOf(j), handler, drawerKtExternalSyntheticLambda15, 50));
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                        } catch (Exception e) {
                            throw new IllegalStateException("Error instantiating AV1 extension", e);
                        }
                    }
                } catch (ClassNotFoundException unused2) {
                }
                try {
                    i4 = i3 + 1;
                } catch (ClassNotFoundException unused3) {
                }
                try {
                    arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, DrawerKtExternalSyntheticLambda15.class, cls).newInstance(Long.valueOf(j), handler, drawerKtExternalSyntheticLambda15, 50));
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused4) {
                    i3 = i4;
                    i4 = i3;
                    arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, DrawerKtExternalSyntheticLambda15.class, cls).newInstance(Long.valueOf(j), handler, drawerKtExternalSyntheticLambda15, 50));
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                }
                try {
                    arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, DrawerKtExternalSyntheticLambda15.class, cls).newInstance(Long.valueOf(j), handler, drawerKtExternalSyntheticLambda15, 50));
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e2) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                throw new IllegalStateException("Error instantiating VP9 extension", e3);
            }
        }
    }

    protected void onWarmupCompleted(Context context, int i2, AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, boolean z, SelectionManagerExternalSyntheticLambda2 selectionManagerExternalSyntheticLambda2, Handler handler, SelectionManagerExternalSyntheticLambda5 selectionManagerExternalSyntheticLambda5, ArrayList<Renderer> arrayList) {
        int i3;
        int i4;
        arrayList.add(new SelectionManager_androidKtExternalSyntheticLambda0(context, onNavigationEvent(), appBarKtExternalSyntheticLambda6, z, handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                try {
                    i3 = size + 1;
                    try {
                        arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(context, handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i3;
                        i3 = size;
                        try {
                            int i5 = i3 + 1;
                            try {
                                arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                            } catch (ClassNotFoundException unused2) {
                            }
                            i3 = i5;
                        } catch (ClassNotFoundException unused3) {
                        }
                        try {
                            try {
                                int i6 = i3 + 1;
                                try {
                                    arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                                } catch (ClassNotFoundException unused4) {
                                }
                                i3 = i6;
                            } catch (Exception e) {
                                throw new IllegalStateException("Error instantiating FLAC extension", e);
                            }
                        } catch (ClassNotFoundException unused5) {
                        }
                        try {
                            try {
                                int i7 = i3 + 1;
                                try {
                                    arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                                } catch (ClassNotFoundException unused6) {
                                }
                                i3 = i7;
                            } catch (Exception e2) {
                                throw new IllegalStateException("Error instantiating FFmpeg extension", e2);
                            }
                        } catch (ClassNotFoundException unused7) {
                        }
                        try {
                            try {
                                i4 = i3 + 1;
                                try {
                                    arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(context, handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                                } catch (ClassNotFoundException unused8) {
                                    i3 = i4;
                                    i4 = i3;
                                    arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                }
                            } catch (Exception e3) {
                                throw new IllegalStateException("Error instantiating IAMF extension", e3);
                            }
                        } catch (ClassNotFoundException unused9) {
                        }
                        arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                    }
                } catch (Exception e4) {
                    throw new IllegalStateException("Error instantiating MIDI extension", e4);
                }
            } catch (ClassNotFoundException unused10) {
            }
            try {
                int i52 = i3 + 1;
                arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                i3 = i52;
                int i62 = i3 + 1;
                arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                i3 = i62;
                int i72 = i3 + 1;
                arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                i3 = i72;
                i4 = i3 + 1;
                arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(context, handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                try {
                    arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, SelectionManagerExternalSyntheticLambda5.class, SelectionManagerExternalSyntheticLambda2.class).newInstance(handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2));
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                } catch (ClassNotFoundException unused11) {
                } catch (Exception e5) {
                    throw new IllegalStateException("Error instantiating MPEG-H extension", e5);
                }
            } catch (Exception e6) {
                throw new IllegalStateException("Error instantiating Opus extension", e6);
            }
        }
    }

    protected void onExtraCallbackWithResult(Context context, ChipKtExternalSyntheticLambda4 chipKtExternalSyntheticLambda4, Looper looper, int i2, ArrayList<Renderer> arrayList) {
        arrayList.add(new ChipKtExternalSyntheticLambda1(chipKtExternalSyntheticLambda4, looper));
    }

    protected void IAuthTabCallback(Context context, BackdropScaffoldKtExternalSyntheticLambda11 backdropScaffoldKtExternalSyntheticLambda11, Looper looper, int i2, ArrayList<Renderer> arrayList) {
        arrayList.add(new BackdropScaffoldKtExternalSyntheticLambda12(backdropScaffoldKtExternalSyntheticLambda11, looper));
        arrayList.add(new BackdropScaffoldKtExternalSyntheticLambda12(backdropScaffoldKtExternalSyntheticLambda11, looper));
    }

    protected void onWarmupCompleted(Context context, int i2, ArrayList<Renderer> arrayList) {
        arrayList.add(new DrawerKtExternalSyntheticLambda19());
    }

    @Deprecated
    protected void IAuthTabCallback(ArrayList<Renderer> arrayList) {
        arrayList.add(new AndroidAlertDialog_androidKtExternalSyntheticLambda1(IAuthTabCallback(this.onExtraCallbackWithResult), null));
    }

    protected void onExtraCallbackWithResult(Context context, ArrayList<Renderer> arrayList) {
        IAuthTabCallback(arrayList);
    }

    protected SelectionManagerExternalSyntheticLambda2 onWarmupCompleted(Context context, boolean z, boolean z2) {
        return new SelectionManagerExternalSyntheticLambda8.IAuthTabCallbackDefault(context).onWarmupCompleted(z).onNavigationEvent(z2).onExtraCallbackWithResult();
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer IAuthTabCallback(Renderer renderer, Handler handler, DrawerKtExternalSyntheticLambda15 drawerKtExternalSyntheticLambda15, SelectionManagerExternalSyntheticLambda5 selectionManagerExternalSyntheticLambda5, ChipKtExternalSyntheticLambda4 chipKtExternalSyntheticLambda4, BackdropScaffoldKtExternalSyntheticLambda11 backdropScaffoldKtExternalSyntheticLambda11) {
        if (renderer.ICustomTabsCallback() == 2) {
            return onExtraCallback(renderer, this.onExtraCallbackWithResult, this.asInterface, this.access000, this.onNavigationEvent, handler, drawerKtExternalSyntheticLambda15, this.onWarmupCompleted);
        }
        return null;
    }

    protected Renderer onExtraCallback(Renderer renderer, Context context, int i2, AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, boolean z, Handler handler, DrawerKtExternalSyntheticLambda15 drawerKtExternalSyntheticLambda15, long j) {
        if (!this.onTransact || renderer.getClass() != DraggableAnchorsNodeExternalSyntheticLambda0.class) {
            return null;
        }
        DraggableAnchorsNodeExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = new DraggableAnchorsNodeExternalSyntheticLambda0.onNavigationEvent(context).onExtraCallback(onNavigationEvent()).onNavigationEvent(appBarKtExternalSyntheticLambda6).onExtraCallback(j).onExtraCallback(z).onExtraCallback(handler).onWarmupCompleted(drawerKtExternalSyntheticLambda15).IAuthTabCallback(50).onNavigationEvent(this.IAuthTabCallbackStubProxy).onExtraCallbackWithResult(this.IAuthTabCallbackStub);
        if (Build.VERSION.SDK_INT >= 34) {
            onnavigationeventOnExtraCallbackWithResult = onnavigationeventOnExtraCallbackWithResult.onWarmupCompleted(this.asBinder);
        }
        return onnavigationeventOnExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    protected AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    protected AnchoredDraggableStateExternalSyntheticLambda4.IAuthTabCallback IAuthTabCallback(Context context) {
        return new AlertDialogKtAlertDialogFlowRow11ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
    }
}
