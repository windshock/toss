// entry=0x5a234

void H59b48(void)

{
  undefined **ppuVar1;
  ulong in_x12;
  long unaff_x26;
  
  if ((-DAT_00275ca8 | 0x642804bbf97b18d3U) + (-DAT_00275ca8 & 0x642804bbf97b18d3U) <= in_x12) {
    in_x12 = 0x3ff;
  }
  *(undefined1 *)(unaff_x26 + in_x12) = 0;
  CallSupervisor(0);
  ppuVar1 = &PTR_LAB_002789f0;
  if ((-DAT_00275ca8 | 0x642804bbf97b1470U) * 2 - (-DAT_00275ca8 ^ 0x642804bbf97b1470U) <
      0xfffffffffffff001) {
    ppuVar1 = &PTR_LAB_00279698;
  }
                    /* WARNING: Could not recover jumptable at 0x00150c68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


