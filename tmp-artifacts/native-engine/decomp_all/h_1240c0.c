// entry=0x1240c0

void H1240c0(long param_1)

{
  undefined **ppuVar1;
  char cVar2;
  uint uVar3;
  char cVar4;
  long in_x9;
  ulong in_x10;
  char *unaff_x23;
  
  cVar2 = **(char **)(in_x9 + in_x10 * 8);
  cVar4 = '\0';
  if ((cVar2 != '\0') && (cVar4 = cVar2, cVar2 == *unaff_x23)) {
    uVar3 = -(int)DAT_00281e58;
                    /* WARNING: Could not recover jumptable at 0x0022bf7c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_0027baa0)[(int)((uVar3 ^ 0xcc88cf70) + (uVar3 & 0xcc88cf70) * 2)])();
    return;
  }
  if (cVar4 == *unaff_x23) {
                    /* WARNING: Could not recover jumptable at 0x00232710. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_H1171b0_0027d428)(0);
    return;
  }
  uVar3 = -(int)DAT_00281e58;
  ppuVar1 = &PTR_LAB_00283950 + (int)((uVar3 | 0xcc88cf92) * 2 - (uVar3 ^ 0xcc88cf92));
  if ((in_x10 ^ 1) + (in_x10 & 1) * 2 != param_1) {
    ppuVar1 = &PTR_H1240c0_0027fa68;
  }
                    /* WARNING: Could not recover jumptable at 0x0022c858. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


