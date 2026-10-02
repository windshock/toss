// entry=0xda718

void Hda718(void)

{
  uint uVar1;
  uint uVar2;
  undefined4 *puVar3;
  long unaff_x19;
  undefined4 unaff_w23;
  
  uVar1 = -(int)DAT_0027b370;
  uVar2 = -(int)DAT_0027b370;
  puVar3 = (undefined4 *)
           (*(code *)(&PTR_FUN_0027c1e0)
                     [(long)(int)((uVar1 ^ 0x816b4073) + (uVar1 & 0x816b4073) * 2) * 300 +
                      (long)(int)((uVar2 | 0x816b4165) + (uVar2 & 0x816b4165))])(1,0x1088);
  *puVar3 = unaff_w23;
  if ((unaff_x19 != -1) != (puVar3 != (undefined4 *)0x0) && unaff_x19 != -1) {
                    /* WARNING: Could not recover jumptable at 0x001dbdc0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00281f38)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001dadd8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027b198)();
  return;
}


