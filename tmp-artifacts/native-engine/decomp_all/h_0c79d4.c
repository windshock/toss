// entry=0xc79d4

void thunk_FUN_001c7fe4(void)

{
  int iVar1;
  
  iVar1 = (int)DAT_00281e28;
                    /* WARNING: Could not recover jumptable at 0x001c807c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_002801c8)[(int)((-iVar1 ^ 0x9992c958U) + (-iVar1 & 0x9992c958U) * 2)])
            (&DAT_0029e620 +
             (long)(int)(-0x666d36be - (-iVar1 ^ 0xffffffffU)) * 0x2b +
             (long)(int)((-iVar1 ^ 0x9992c968U) + (-iVar1 & 0x9992c968U) * 2));
  return;
}


