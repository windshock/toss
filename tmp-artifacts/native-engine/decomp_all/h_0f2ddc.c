// entry=0xf2ddc

void Hf2ddc(void)

{
  undefined2 uVar1;
  int iVar2;
  
  iVar2 = (int)DAT_00277498;
  uVar1 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((-iVar2 ^ 0xef26e41bU) + (-iVar2 & 0x6f26e41bU) * 2) * 300 +
                     (long)(int)((iVar2 * -2 | 0xde4dca4aU) - (-iVar2 ^ 0xef26e525U))])();
                    /* WARNING: Could not recover jumptable at 0x001f2b40. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&DAT_0027a9d0)
            [(int)((-(int)DAT_00277498 ^ 0xef26e43bU) + (-(int)DAT_00277498 & 0xef26e43bU) * 2)])
            (uVar1);
  return;
}


