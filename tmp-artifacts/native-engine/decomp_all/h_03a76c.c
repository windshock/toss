// entry=0x3a76c

void H384f4(void)

{
  undefined8 *puVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  
  DAT_0029e854 = (-(int)DAT_0027ba40 | 0x2a074dbdU) + (-(int)DAT_0027ba40 & 0x2a074dbdU);
  uVar3 = -DAT_0027ba40;
  uVar4 = -DAT_0027ba40;
  memset(&stack0x0000005c +
         (uVar3 | 0x517618022a074dbd) + (uVar3 & 0x517618022a074dbd) +
         ((uVar4 | 0x517618022a074dbd) * 2 - (uVar4 ^ 0x517618022a074dbd)) * 0x5c,0,0x5c);
  iVar2 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)(0x2a074dbc - (-(int)DAT_0027ba40 ^ 0xffffffffU)) * 300 +
                     (long)(int)(0x2a074e7f - (-(int)DAT_0027ba40 ^ 0xffffffffU))])
                    (&DAT_00282ee8,
                     &stack0x0000005c +
                     (uVar3 | 0x517618022a074dbd) + (uVar3 & 0x517618022a074dbd) +
                     ((uVar4 | 0x517618022a074dbd) * 2 - (uVar4 ^ 0x517618022a074dbd)) * 0x5c);
  puVar1 = &DAT_002811b0;
  if (0 < iVar2) {
    puVar1 = &DAT_0027d650;
  }
                    /* WARNING: Could not recover jumptable at 0x00138638. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*puVar1)(0x2a074dbc - (-(int)DAT_0027ba40 ^ 0xffffffffU));
  return;
}


