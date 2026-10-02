// entry=0xc4c60

void Hc4c60(code *param_1)

{
  ulong uVar1;
  
  uVar1 = (*param_1)((-(int)DAT_00275250 ^ 0x330208ceU) + (-(int)DAT_00275250 & 0x330208ceU) * 2);
                    /* WARNING: Could not recover jumptable at 0x001c4f00. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00277488)
            [(long)(int)((-(int)DAT_00275250 ^ 0x330208ceU) + (-(int)DAT_00275250 & 0x330208ceU) * 2
                        ) * 0x66])((uVar1 ^ 0x2df1ec32) + (uVar1 & 0x2df1ec32) * 2);
  return;
}


