// entry_off=143bc4 name=H143bc4 body=[[00242c88, 00242c9b] [00243098, 002430ab] [00243bc4, 00243c2b]]

void H143bc4(void)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = -(int)DAT_00275280;
  uVar2 = -(int)DAT_00275280;
                    /* WARNING: Could not recover jumptable at 0x00242c98. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275dc8)
            ((&DAT_0029e620)
             [(long)(int)((uVar2 | 0x7d3edd2f) * 2 - (uVar2 ^ 0x7d3edd2f)) * 0x2b +
              (long)(int)((uVar1 | 0x7d3edd3e) + (uVar1 & 0x7d3edd3e))]);
  return;
}


