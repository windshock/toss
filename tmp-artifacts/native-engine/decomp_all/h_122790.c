// entry=0x122790

void H122790(void)

{
  long in_x14;
  long lVar1;
  
  lVar1 = (-DAT_00281e58 | 0x42c7e286cc88cf42U) + (-DAT_00281e58 & 0x42c7e286cc88cf42U);
  do {
    lVar1 = (lVar1 - ((-DAT_00281e58 | 0x42c7e286cc88cf43U) + (-DAT_00281e58 & 0x42c7e286cc88cf43U)
                     ^ 0xffffffffffffffff)) + -1;
  } while (lVar1 != in_x14);
                    /* WARNING: Could not recover jumptable at 0x00218490. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027d860)();
  return;
}


