// entry=0xaefd4

void Hae580(undefined8 param_1,uint param_2,ulong param_3)

{
  undefined **ppuVar1;
  uint uVar2;
  uint in_w15;
  long unaff_x19;
  
  uVar2 = 0;
  if (in_w15 != 0) {
    uVar2 = param_2 / in_w15;
  }
  *(undefined1 *)(*(long *)(unaff_x19 + 0x270) + param_3) =
       (&DAT_0027ad10)[(param_2 | -(uVar2 * in_w15)) + (param_2 & -(uVar2 * in_w15))];
  ppuVar1 = &PTR_LAB_0027bc18;
  if (in_w15 <= param_2) {
    ppuVar1 = &PTR_Hae580_0027fe98;
  }
                    /* WARNING: Could not recover jumptable at 0x001ae5ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(param_1,uVar2,(param_3 ^ 1) + (param_3 & 1) * 2);
  return;
}


