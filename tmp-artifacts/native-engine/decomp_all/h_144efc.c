// entry=0x144efc

void H1447d0(void)

{
  undefined **ppuVar1;
  uint uVar2;
  short in_w8;
  ulong uVar3;
  long in_x9;
  long in_x10;
  uint in_w11;
  int iVar4;
  undefined8 *unaff_x29;
  byte *in_stack_00000000;
  undefined *puStack0000000000000018;
  
  do {
    iVar4 = (int)DAT_00282ec0;
    uVar2 = in_w11 * ((-iVar4 | 0x95b7U) * 2 - (-iVar4 ^ 0x95b7U));
    in_w11 = (uVar2 ^ 0xffffffff) & (uint)*in_stack_00000000 |
             uVar2 & (*in_stack_00000000 ^ 0xffffffff);
    in_x10 = (in_x10 - ((-DAT_00282ec0 | 0x8b75c5dcf3f49597U) +
                        (-DAT_00282ec0 & 0x8b75c5dcf3f49597U) ^ 0xffffffffffffffff)) + -1;
    in_stack_00000000 =
         in_stack_00000000 +
         (-DAT_00282ec0 ^ 0x8b75c5dcf3f49597U) + (-DAT_00282ec0 & 0x8b75c5dcf3f49597U) * 2;
  } while (in_x10 != in_x9);
  if ((short)in_w11 == in_w8) {
    puStack0000000000000018 =
         (&PTR_FUN_0027c1e0)
         [(long)(int)(-0xc0b6a6b - (-iVar4 ^ 0xffffffffU)) * 300 +
          (long)(int)((-iVar4 ^ 0xf3f495f5U) + (-iVar4 & 0xf3f495f5U) * 2)];
    ppuVar1 = &PTR_LAB_0027f4d8 +
              (long)(int)((-iVar4 ^ 0xf3f49596U) + (-iVar4 & 0xf3f49596U) * 2) * 0x72;
    if (iVar4 != -0xc0b6ac2) {
      ppuVar1 = &PTR_LAB_00275bd0;
    }
                    /* WARNING: Could not emulate address calculation at 0x00244fec */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(0xa972);
    return;
  }
  uVar3 = 0x8b75c5dcf3f4959d - (-DAT_00282ec0 ^ 0xffffffffffffffffU);
  *(undefined8 *)(((ulong)unaff_x29 | uVar3) * 2 - ((ulong)unaff_x29 ^ uVar3)) = 0x28;
  *unaff_x29 = 0x1c;
  return;
}


