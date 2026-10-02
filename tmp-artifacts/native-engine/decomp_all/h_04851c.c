// entry=0x4851c

void H48054(void)

{
  ulong uVar1;
  undefined **ppuVar2;
  uint uVar3;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  
  uVar3 = -(int)DAT_00275ca8;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar3 | 0xf97b14d4) * 2 - (uVar3 ^ 0xf97b14d4)) * 300 +
             (long)(int)(-0x684eadd - (-(int)DAT_00275ca8 ^ 0xffffffffU))])
            (*(undefined8 *)(unaff_x20 + unaff_x22 * 8));
  uVar1 = (-DAT_00275ca8 | 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U);
  ppuVar2 = &PTR_LAB_0027d788;
  if ((unaff_x22 ^ uVar1) + (unaff_x22 & uVar1) * 2 != unaff_x21) {
    ppuVar2 = (undefined **)&DAT_0027ea00;
  }
                    /* WARNING: Could not recover jumptable at 0x0014812c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


