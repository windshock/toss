// entry=0xbbbe0

void Hbbbe0(void)

{
  int iVar1;
  
  iVar1 = (int)DAT_00278620;
                    /* WARNING: Could not recover jumptable at 0x001bbbd4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x63177874 - (-iVar1 ^ 0xffffffffU)) * 300 +
             (long)(int)((-iVar1 | 0x9ce887b5U) + (-iVar1 & 0x9ce887b5U))])
            ((-iVar1 | 0x9ce8878eU) + (-iVar1 & 0x9ce8878eU));
  return;
}


