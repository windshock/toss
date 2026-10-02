// entry=0xe4bec

void He4bec(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  int in_w8;
  long in_x10;
  ulong in_x11;
  int iVar4;
  long unaff_x21;
  
  iVar4 = (int)DAT_002765f0;
  uVar3 = *(int *)(unaff_x21 + in_x11 * 4) * ((-iVar4 ^ 0xd770d133U) + (-iVar4 & 0xd770d133U) * 2);
  uVar2 = uVar3 >> (ulong)((-iVar4 ^ 0xe7b6U) + (-iVar4 & 0xe7b6U) * 2 & 0x1f);
  uVar2 = ((uVar2 | uVar3) & (uVar2 & uVar3 ^ 0xffffffff)) *
          ((-iVar4 | 0xd770d133U) + (-iVar4 & 0xd770d133U));
  uVar3 = in_w8 * ((-iVar4 | 0xd770d133U) * 2 - (-iVar4 ^ 0xd770d133U));
  ppuVar1 = &PTR_LAB_00278f98;
  if ((in_x11 | 1) + (in_x11 & 1) != in_x10) {
    ppuVar1 = &PTR_He4bec_002804d8;
  }
                    /* WARNING: Could not recover jumptable at 0x001e4d04. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)((uVar2 | uVar3) & (uVar2 & uVar3 ^ 0xffffffff));
  return;
}


