// entry=0x14c0dc

void H14c0dc(undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4,
            undefined8 *param_5,uint param_6)

{
  uint uVar1;
  uint in_w8;
  ulong in_x9;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x27;
  ulong unaff_x30;
  
  uVar1 = 0;
  if (in_w8 != 0) {
    uVar1 = param_6 / in_w8;
  }
  *(undefined1 *)
   (unaff_x21 +
    ((unaff_x30 | -*(long *)(unaff_x22 + 0x260)) * 2 - (unaff_x30 ^ -*(long *)(unaff_x22 + 0x260)))
    * param_2 + (in_x9 | 1) + (in_x9 & 1)) =
       *(undefined1 *)
        (unaff_x23 + (ulong)((param_6 ^ -(uVar1 * in_w8)) + (param_6 & -(uVar1 * in_w8)) * 2));
  if (in_w8 <= param_6) {
    unaff_x27 = param_5;
  }
                    /* WARNING: Could not recover jumptable at 0x0024c0d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*unaff_x27)();
  return;
}


