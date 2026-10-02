// entry=0x53fac

void H53fac(undefined8 param_1,uint param_2,ulong param_3)

{
  undefined **ppuVar1;
  uint uVar2;
  uint in_w15;
  long unaff_x19;
  
  uVar2 = 0;
  if (in_w15 != 0) {
    uVar2 = param_2 / in_w15;
  }
  *(undefined1 *)
   (*(long *)(unaff_x19 + 0x280) +
    ((-DAT_00275ca8 ^ 0x642804bbf97b14d4U) + (-DAT_00275ca8 & 0x642804bbf97b14d4U) * 2) * 0x14 +
   param_3) = (&DAT_0027ad10)
              [(ulong)((param_2 | -(uVar2 * in_w15)) * 2 - (param_2 ^ -(uVar2 * in_w15))) +
               ((-DAT_00275ca8 | 0x642804bbf97b14d4U) + (-DAT_00275ca8 & 0x642804bbf97b14d4U)) *
               0x10];
  ppuVar1 = &PTR_thunk_FUN_0014ae5c_00280230;
  if (in_w15 <= param_2) {
    ppuVar1 = &PTR_H53fac_0027f648;
  }
                    /* WARNING: Could not recover jumptable at 0x00154070. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(param_1,uVar2,(param_3 | 1) * 2 - (param_3 ^ 1));
  return;
}


