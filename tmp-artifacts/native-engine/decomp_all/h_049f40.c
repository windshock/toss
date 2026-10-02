// entry=0x49f40

void H49f40(void)

{
  ulong unaff_x22;
  undefined8 *unaff_x25;
  
  if (unaff_x22 < 0x10) {
                    /* WARNING: Could not recover jumptable at 0x0014b85c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00281c70)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0014fa18. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027d9a0)(*unaff_x25);
  return;
}


