// entry=0x7ef64

void H7ef64(undefined8 param_1,undefined8 param_2)

{
  undefined **ppuVar1;
  undefined4 uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  undefined4 *in_x9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int unaff_w25;
  undefined1 auVar6 [16];
  
  uVar2 = *in_x9;
  uVar3 = -(int)DAT_00274480;
  uVar4 = -(int)DAT_00274480;
  auVar6 = (*(code *)(&PTR_FUN_0027c1e0)
                     [(long)(int)((uVar4 | 0x94f8c2f2) + (uVar4 & 0x94f8c2f2)) * 300 +
                      (long)(int)((uVar3 ^ 0x94f8c32a) + (uVar3 & 0x94f8c32a) * 2)])
                     (2,param_2,unaff_x20 + 0xc,
                      -0x66442ea56b073cfb - (-DAT_00274480 ^ 0xffffffffffffffffU));
  uVar3 = -(int)DAT_00274480;
  auVar6 = (*(code *)(&PTR_FUN_0027c1e0)
                     [(long)(int)((uVar3 | 0x94f8c2f2) + (uVar3 & 0x94f8c2f2)) * 300 +
                      (long)(int)(-0x6b073c17 - (-(int)DAT_00274480 ^ 0xffffffffU))])
                     (2,auVar6._8_8_,auVar6._0_8_,
                      (ulong)(&PTR_FUN_0027c1e0)
                             [(long)(int)((uVar3 | 0x94f8c2f2) + (uVar3 & 0x94f8c2f2)) * 300 +
                              (long)(int)(-0x6b073c17 - (-(int)DAT_00274480 ^ 0xffffffffU))] & 0xff,
                      *(undefined4 *)(unaff_x19 + unaff_x21 * 0x14 + 8),
                      (long)*(int *)(unaff_x19 + unaff_x21 * 0x14 + 4));
  uVar3 = -(int)DAT_00274480;
  iVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 300 +
                     (long)(int)((uVar3 | 0x94f8c3ea) + (uVar3 & 0x94f8c3ea))])
                    (2,auVar6._8_8_,auVar6._0_8_,
                     (ulong)(&PTR_FUN_0027c1e0)
                            [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 300 +
                             (long)(int)((uVar3 | 0x94f8c3ea) + (uVar3 & 0x94f8c3ea))] & 0xff,uVar2,
                     *(undefined4 *)(unaff_x20 + 0x2c));
  ppuVar1 = &PTR_LAB_00279118;
  if (iVar5 != unaff_w25) {
    ppuVar1 = &PTR_LAB_0027b608;
  }
                    /* WARNING: Could not recover jumptable at 0x0017f140. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


