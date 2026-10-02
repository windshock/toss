// entry=0xc27b4

void Hc27b4(void)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  int *unaff_x20;
  
  DAT_002862c0 = 0;
  uVar1 = -(int)DAT_0027a2f0;
  uVar2 = -(int)DAT_0027a2f0;
  DAT_0029e600 = (undefined *)
                 (*(code *)(&PTR_FUN_0027c1e0)
                           [(long)(int)((uVar1 | 0x8c8f2a08) * 2 - (uVar1 ^ 0x8c8f2a08)) * 300 +
                            (long)(int)((uVar2 ^ 0x8c8f2b08) + (uVar2 & 0x8c8f2b08) * 2)])
                           (0,&DAT_00282828);
  iVar3 = (int)DAT_0027a2f0;
  if ((DAT_0029e600 != (undefined *)0x0) !=
      (DAT_0029e600 ==
      (&PTR_FUN_0027c1e0)
      [(long)(int)((-iVar3 | 0x8c8f2a08U) + (-iVar3 & 0x8c8f2a08U)) * 300 +
       (long)(int)((-iVar3 | 0x8c8f2a2eU) + (-iVar3 & 0x8c8f2a2eU))]) &&
      DAT_0029e600 != (undefined *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x001c3fac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_0027f7f8)[(int)(-0x7370d59d - (-iVar3 ^ 0xffffffffU))])
              (&PTR_FUN_0027c1e0 +
               (long)(int)(-0x7370d5f9 - (-iVar3 ^ 0xffffffffU)) * 300 +
               (long)(int)(-0x7370d5d3 - (-iVar3 ^ 0xffffffffU)));
    return;
  }
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x001c3460. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00277758)((long)*unaff_x20);
  return;
}


