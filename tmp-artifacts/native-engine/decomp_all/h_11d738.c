// entry=0x11d738

void H11d738(ulong param_1)

{
  undefined *UNRECOVERED_JUMPTABLE;
  long unaff_x19;
  long unaff_x22;
  
  if (*(ulong *)(unaff_x19 + 0x360) < param_1) {
    **(undefined4 **)(unaff_x19 + 0x788) = (int)*(undefined8 *)(unaff_x22 + 0x20);
    **(undefined4 **)(unaff_x19 + 0x780) = (int)*(undefined8 *)(unaff_x22 + 0x38);
    UNRECOVERED_JUMPTABLE = PTR_LAB_00277120;
    *(int *)(unaff_x19 + 0x1f8) =
         (int)(char)((-(char)DAT_00281e58 & 0x7fU | 0x43) << 1) -
         (int)(char)(-(char)DAT_00281e58 ^ 0x43);
                    /* WARNING: Could not recover jumptable at 0x0022ddec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)UNRECOVERED_JUMPTABLE)();
    return;
  }
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x0022953c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00278a88)(*(undefined8 *)(unaff_x19 + 0x360),*(undefined8 *)(unaff_x19 + 0x378))
  ;
  return;
}


