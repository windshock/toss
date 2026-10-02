// entry=0x97d04

void H97d04(void)

{
  undefined **ppuVar1;
  uint uVar2;
  undefined8 in_x4;
  undefined8 in_x6;
  undefined8 in_x7;
  uint in_w14;
  uint in_w15;
  long unaff_x19;
  undefined8 unaff_x24;
  
  *(undefined8 *)(unaff_x19 + 0x90) = unaff_x24;
  *(undefined8 *)(unaff_x19 + 0x98) = in_x7;
  *(undefined8 *)(unaff_x19 + 0xa0) = in_x4;
  *(undefined8 *)(unaff_x19 + 0xa8) = in_x6;
  uVar2 = 0;
  if (in_w14 != 0) {
    uVar2 = in_w15 / in_w14;
  }
  *(undefined1 *)
   (*(long *)(unaff_x19 + 0x270) +
    ((-DAT_0027fb18 ^ 0x2e00d84656e407c0U) + (-DAT_0027fb18 & 0x2e00d84656e407c0U) * 2) * 0x14 +
   (-DAT_0027fb18 ^ 0x2e00d84656e407c0U) + (-DAT_0027fb18 & 0x2e00d84656e407c0U) * 2) =
       (&DAT_0027ad10)
       [(ulong)((in_w15 | -(uVar2 * in_w14)) * 2 - (in_w15 ^ -(uVar2 * in_w14))) +
        ((-DAT_0027fb18 ^ 0x2e00d84656e407c0U) + (-DAT_0027fb18 & 0x2e00d84656e407c0U) * 2) * 0x10];
  ppuVar1 = &PTR_LAB_00278e50;
  if (in_w14 <= in_w15) {
    ppuVar1 = &PTR_LAB_00279460;
  }
                    /* WARNING: Could not recover jumptable at 0x00195ee8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(*ppuVar1,&PTR_LAB_00278e50,1);
  return;
}


