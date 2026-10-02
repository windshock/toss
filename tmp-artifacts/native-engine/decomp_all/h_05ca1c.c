// entry=0x5ca1c

void H5acd0(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  long unaff_x19;
  undefined8 *unaff_x28;
  
  uVar2 = -(int)DAT_00275ca8;
  uVar3 = -(int)DAT_00275ca8;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar3 | 0xf97b14d4) * 2 - (uVar3 ^ 0xf97b14d4)) * 300 +
             (long)(int)((uVar2 | 0xf97b1524) + (uVar2 & 0xf97b1524))])();
  *unaff_x28 = 0;
  **(long **)(unaff_x19 + 0x1a8) =
       (-DAT_00275ca8 ^ 0x642804bbf97b14d4U) + (-DAT_00275ca8 & 0x642804bbf97b14d4U) * 2;
  **(int **)(unaff_x19 + 0x1b0) =
       (-(int)DAT_00275ca8 ^ 0xf97b14d4U) + (-(int)DAT_00275ca8 & 0xf97b14d4U) * 2;
  ppuVar1 = &PTR_LAB_0027aa18;
  if (*(long *)(unaff_x19 + 0x1a0) != 0) {
    ppuVar1 = (undefined **)&DAT_00285d08;
  }
                    /* WARNING: Could not recover jumptable at 0x0014adc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(*(undefined8 *)(unaff_x19 + 0x198));
  return;
}


