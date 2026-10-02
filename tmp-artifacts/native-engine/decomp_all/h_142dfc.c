// entry=0x142dfc

void H142a30(void)

{
  long lVar1;
  long unaff_x19;
  
  memset((void *)(unaff_x19 + 8),0,0x810);
  lVar1 = (-DAT_00275280 ^ 0x86cb2f4c7d3edccbU) + (-DAT_00275280 & 0x86cb2f4c7d3edccbU) * 2;
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x00243930. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00285ca8)
            (lVar1 << 0x20,lVar1,&DAT_0027a318,
             (-DAT_00275280 ^ 0x86cb2f4c7d3edd2fU) + (-DAT_00275280 & 0x86cb2f4c7d3edd2fU) * 2,
             (-DAT_00275280 | 0x86cb2f4c7d3edd2fU) * 2 - (-DAT_00275280 ^ 0x86cb2f4c7d3edd2fU));
  return;
}


