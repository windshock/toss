// entry=0x13a5fc

void H13a5fc(void)

{
  ulong *unaff_x19;
  long in_stack_00000068;
  
  if ((long)((*unaff_x19 | -in_stack_00000068) * 2 - (*unaff_x19 ^ -in_stack_00000068)) <=
      (long)(0x3f63e72908692047 - (-DAT_00279eb0 ^ 0xffffffffffffffffU))) {
                    /* WARNING: Could not recover jumptable at 0x0023e264. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00281b78)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0023f358. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00280c58)();
  return;
}


