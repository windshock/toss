// entry=0x55dfc

void thunk_FUN_001565a0(void)

{
  undefined **ppuVar1;
  long in_x14;
  long in_x15;
  long unaff_x19;
  long unaff_x28;
  
  *(undefined1 *)
   (unaff_x28 + (0x642804bbf97b14d3 - (-DAT_00275ca8 ^ 0xffffffffffffffffU)) * 0x400 + in_x14) =
       *(undefined1 *)(*(long *)(unaff_x19 + 0x280) + in_x15);
  ppuVar1 = &PTR_FUN_0027f3e8;
  if (0 < in_x15 == 0x642804bbf97b18d3 - (-DAT_00275ca8 ^ 0xffffffffffffffffU) <= in_x14 + 1U ||
      0 >= in_x15) {
    ppuVar1 = &PTR_LAB_00274268;
  }
                    /* WARNING: Could not recover jumptable at 0x00156670. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


