// entry=0x120860

void H120860(long param_1)

{
  long unaff_x19;
  
  *(undefined1 *)
   (*(long *)(unaff_x19 + 0x528) +
    ((-DAT_00281e58 | 0x42c7e286cc88cf42U) * 2 - (-DAT_00281e58 ^ 0x42c7e286cc88cf42U)) * 0x400 +
   param_1) = 0;
                    /* WARNING: Could not recover jumptable at 0x00227430. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00274e28)();
  return;
}


