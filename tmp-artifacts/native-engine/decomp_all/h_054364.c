// entry=0x54364

void H53604(void)

{
  bool bVar1;
  undefined **ppuVar2;
  char cVar3;
  ushort uVar4;
  int iVar5;
  uint uVar6;
  byte bVar7;
  ulong uVar8;
  undefined8 uVar9;
  undefined8 in_x4;
  undefined8 *in_x5;
  byte *in_x6;
  byte *in_x7;
  uint in_w8;
  long lVar10;
  ulong in_x9;
  char in_w10;
  uint uVar11;
  undefined8 in_x14;
  undefined8 uVar12;
  char *in_x16;
  undefined8 uVar13;
  long unaff_x19;
  long *unaff_x20;
  int *unaff_x22;
  long *unaff_x23;
  long lVar14;
  long unaff_x26;
  byte *unaff_x30;
  
  if (in_w10 == 't') {
    *(long *)(unaff_x19 + 0x60) = unaff_x26;
    *(byte **)(unaff_x19 + 0x160) = unaff_x30;
    *(byte **)(unaff_x19 + 0x168) = in_x7;
    *(byte **)(unaff_x19 + 0x170) = in_x6;
    uVar11 = -(int)DAT_00275ca8;
    uVar6 = -(int)DAT_00275ca8;
    ppuVar2 = &PTR_LAB_00276dd8 +
              (long)(int)((uVar11 | 0xf97b14d4) * 2 - (uVar11 ^ 0xf97b14d4)) * 0x6f +
              (long)(int)((uVar6 | 0xf97b14ec) + (uVar6 & 0xf97b14ec));
    if (*in_x16 != 'a') {
      ppuVar2 = &PTR_LAB_002826d8;
    }
                    /* WARNING: Could not recover jumptable at 0x0014daf8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  uVar9 = *(undefined8 *)(unaff_x19 + 0x130);
  if (in_w10 != 't') {
    uVar11 = 0x2f;
    if ((in_x9 & 1) != 0) {
      in_w8 = (uint)*in_x6;
      bVar7 = -(char)DAT_00275ca8;
      uVar11 = 100;
      if (*in_x6 == (byte)((bVar7 ^ 0x38) + (bVar7 & 0x38) * '\x02')) {
        in_w8 = (uint)*in_x7;
        uVar11 = (-(int)DAT_00275ca8 ^ 0xf97b1535U) + (-(int)DAT_00275ca8 & 0xf97b1535U) * 2;
        if (*in_x7 == 0x61) {
          in_w8 = (uint)*unaff_x30;
          bVar7 = -(char)DAT_00275ca8;
          uVar11 = 0x74;
          uVar9 = *(undefined8 *)(unaff_x19 + 0x130);
          if (*unaff_x30 == (byte)((bVar7 ^ 0x48) + (bVar7 & 0x48) * '\x02')) {
            ppuVar2 = &PTR_LAB_00274b30;
            if (*in_x16 != 'a') {
              ppuVar2 = &PTR_LAB_0027f310;
            }
                    /* WARNING: Could not recover jumptable at 0x0015bf60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)*ppuVar2)();
            return;
          }
        }
      }
    }
    uVar13 = *(undefined8 *)(unaff_x19 + 0x140);
    uVar12 = *(undefined8 *)(unaff_x19 + 0x138);
    if (uVar11 != (in_w8 & 0xff)) {
      do {
        lVar10 = *unaff_x20;
        if (lVar10 == 0) {
          iVar5 = *unaff_x22;
          CallSupervisor(0);
          bVar1 = 0xfffffffffffff000 <
                  (ulong)(((long)iVar5 <<
                          ((-DAT_00275ca8 ^ 0x14f4U) + (-DAT_00275ca8 & 0x14f4U) * 2 & 0x3f)) >>
                         0x20);
          ppuVar2 = &PTR_LAB_00279a38;
          if ((iVar5 != 0 || !bVar1) && (iVar5 == 0) == bVar1) {
            ppuVar2 = &PTR_LAB_002824b8;
          }
                    /* WARNING: Could not recover jumptable at 0x00153cec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)*ppuVar2)((long)iVar5,in_x4,
                              0x642804bbf97b253b - (-DAT_00275ca8 ^ 0xffffffffffffffffU));
          return;
        }
        lVar14 = *unaff_x23;
        uVar4 = *(ushort *)(lVar14 + 0x10);
        *unaff_x23 = lVar14 + (ulong)uVar4;
        *unaff_x20 = (lVar10 - (-(ulong)uVar4 ^ 0xffffffffffffffff)) + -1;
        *in_x5 = *(undefined8 *)(lVar14 + 8);
        if (lVar14 == 0) {
                    /* WARNING: Could not recover jumptable at 0x0015158c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR_LAB_00278eb8)();
          return;
        }
        *(long *)(unaff_x19 + 0x118) = lVar14 + 0x13;
      } while (*(char *)(lVar14 + 0x13) == '.');
      *(undefined8 *)(unaff_x19 + 0x130) = uVar9;
      *(undefined8 *)(unaff_x19 + 0x138) = uVar12;
      *(undefined8 *)(unaff_x19 + 0x140) = uVar13;
      cVar3 = **(char **)(unaff_x19 + 0x2f8);
      if (cVar3 == '\0') {
        *(undefined1 *)
         (unaff_x26 +
         ((-DAT_00275ca8 | 0x642804bbf97b14d4U) * 2 - (-DAT_00275ca8 ^ 0x642804bbf97b14d4U))) = 0;
        uVar8 = (-DAT_00275ca8 | 0x642804bbf97b1470U) * 2 - (-DAT_00275ca8 ^ 0x642804bbf97b1470U);
        CallSupervisor(0);
        ppuVar2 = &PTR_LAB_002789f0;
        if (uVar8 < 0xfffffffffffff001) {
          ppuVar2 = &PTR_LAB_00279698;
        }
                    /* WARNING: Could not recover jumptable at 0x00150c68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)*ppuVar2)(uVar8,unaff_x26,unaff_x26,*(undefined8 *)(unaff_x19 + 0x130));
        return;
      }
      *(undefined8 *)(unaff_x19 + 0x148) = in_x14;
      uVar11 = -((uint)DAT_00275ca8 & 1);
      if ((((uint)(cVar3 == '%') ^ (uVar11 | 1) & (uVar11 & 1 ^ 1) ^ 1) & (uint)(cVar3 == '%')) != 0
         ) {
                    /* WARNING: Could not recover jumptable at 0x0015c9ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_0027fcd8)
                  (*(long *)(unaff_x19 + 0x118) < 0,-DAT_00275ca8 ^ 0x642804bbf97b14d5);
        return;
      }
      *(char *)(unaff_x26 +
                ((-DAT_00275ca8 ^ 0x642804bbf97b14d4U) + (-DAT_00275ca8 & 0x642804bbf97b14d4U) * 2)
                * 0x400 +
               (-DAT_00275ca8 ^ 0x642804bbf97b14d4U) + (-DAT_00275ca8 & 0x642804bbf97b14d4U) * 2) =
           cVar3;
                    /* WARNING: Could not recover jumptable at 0x00154b44. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00276a28)(-DAT_00275ca8 ^ 0x642804bbf97b14d5);
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00150a10. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00283258)();
  return;
}


