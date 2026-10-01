package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.Assertions;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    public static Projection createEquirectangular(int i2) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i2);
    }

    public static Projection createEquirectangular(float f, int i2, int i3, float f2, float f3, int i4) {
        int i5;
        int i6;
        float[] fArr;
        int i7;
        float f4 = f;
        int i8 = i2;
        int i9 = i3;
        Assertions.checkArgument(f4 > 0.0f);
        Assertions.checkArgument(i8 > 0);
        Assertions.checkArgument(i9 > 0);
        Assertions.checkArgument(f2 > 0.0f && f2 <= 180.0f);
        Assertions.checkArgument(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i8;
        float f6 = radians2 / i9;
        int i10 = i9 + 1;
        int i11 = ((i10 << 1) + 2) * i8;
        float[] fArr2 = new float[i11 * 3];
        float[] fArr3 = new float[i11 << 1];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i8) {
            float f7 = radians / 2.0f;
            float f8 = (i12 * f5) - f7;
            int i15 = i12 + 1;
            float f9 = i15;
            int i16 = 0;
            while (i16 < i10) {
                float f10 = f8;
                int i17 = i15;
                int i18 = 0;
                int i19 = 2;
                while (i18 < i19) {
                    float f11 = i18 == 0 ? f10 : (f9 * f5) - f7;
                    int i20 = i10;
                    float f12 = i16 * f6;
                    int i21 = i16;
                    double d = f4;
                    float f13 = f5;
                    float f14 = f6;
                    double d2 = (f12 + 3.1415927f) - (radians2 / 2.0f);
                    int i22 = i18;
                    double d3 = f11;
                    float[] fArr4 = fArr3;
                    float f15 = f9;
                    fArr2[i14] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                    int i23 = i12;
                    int i24 = i13;
                    fArr2[i14 + 1] = (float) (d * Math.sin(d3));
                    int i25 = i14 + 3;
                    fArr2[i14 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr4[i24] = f12 / radians2;
                    i13 = i24 + 2;
                    fArr4[i24 + 1] = ((i23 + i22) * f13) / radians;
                    if (i21 == 0 && i22 == 0) {
                        i5 = i3;
                        i6 = i21;
                    } else {
                        i5 = i3;
                        i6 = i21;
                        if (i6 != i5 || i22 != 1) {
                            fArr = fArr4;
                            i7 = 2;
                            i14 = i25;
                        }
                        fArr3 = fArr;
                        i19 = i7;
                        i12 = i23;
                        i10 = i20;
                        f5 = f13;
                        f6 = f14;
                        f9 = f15;
                        i18 = i22 + 1;
                        f4 = f;
                        int i26 = i6;
                        i9 = i5;
                        i16 = i26;
                    }
                    System.arraycopy(fArr2, i14, fArr2, i25, 3);
                    i14 += 6;
                    fArr = fArr4;
                    i7 = 2;
                    System.arraycopy(fArr, i24, fArr, i13, 2);
                    i13 = i24 + 4;
                    fArr3 = fArr;
                    i19 = i7;
                    i12 = i23;
                    i10 = i20;
                    f5 = f13;
                    f6 = f14;
                    f9 = f15;
                    i18 = i22 + 1;
                    f4 = f;
                    int i262 = i6;
                    i9 = i5;
                    i16 = i262;
                }
                f8 = f10;
                i9 = i9;
                i15 = i17;
                f5 = f5;
                f6 = f6;
                f9 = f9;
                i16++;
                f4 = f;
            }
            f4 = f;
            i8 = i2;
            i12 = i15;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr2, fArr3, 1)), i4);
    }

    public Projection(Mesh mesh, int i2) {
        this(mesh, mesh, i2);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i2) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i2;
        this.singleMesh = mesh == mesh2;
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i2, float[] fArr, float[] fArr2, int i3) {
            this.textureId = i2;
            Assertions.checkArgument((((long) fArr.length) << 1) == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i3;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }

        public SubMesh getSubMesh(int i2) {
            return this.subMeshes[i2];
        }
    }
}
