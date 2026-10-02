// entry=0x4e2bc

void H4de44(long param_1)

{
  undefined **ppuVar1;
  code *UNRECOVERED_JUMPTABLE;
  long unaff_x19;
  undefined8 unaff_x22;
  
  ppuVar1 = &PTR_LAB_00278600;
  if (*(char *)(param_1 + 2) !=
      (byte)((-(char)DAT_00275ca8 | 0xf4U) * '\x02' - (-(char)DAT_00275ca8 ^ 0xf4U))) {
    ppuVar1 = &PTR_LAB_00280a38;
  }
  UNRECOVERED_JUMPTABLE = (code *)*ppuVar1;
  *(undefined8 *)(unaff_x19 + 0x1e8) = unaff_x22;
                    /* WARNING: Could not recover jumptable at 0x0014deac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)();
  return;
}


