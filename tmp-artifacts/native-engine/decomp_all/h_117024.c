// entry=0x117024

void H117024(void)

{
  ulong uVar1;
  ulong in_x11;
  
  do {
    uVar1 = (-DAT_00281e58 | 0x42c7e286cc88cf43U) + (-DAT_00281e58 & 0x42c7e286cc88cf43U);
    in_x11 = (in_x11 | uVar1) * 2 - (in_x11 ^ uVar1);
  } while (in_x11 != (-DAT_00281e58 | 0x42c7e286cc88d1d2U) + (-DAT_00281e58 & 0x42c7e286cc88d1d2U));
                    /* WARNING: Could not recover jumptable at 0x0022da54. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275ab8)();
  return;
}


